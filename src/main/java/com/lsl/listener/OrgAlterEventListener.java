package com.lsl.listener;

import com.lsl.entity.OrgEvent;
import com.lsl.listener.event.OrgAlterEvent;
import com.lsl.util.threadPool.ThreadPoolUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.annotation.PreDestroy;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 组织变更事件监听类
 *
 * @author liushaoli
 * @date 2018/11/16
 **/
@Component
@Slf4j
public class OrgAlterEventListener {
    private static ThreadPoolExecutor executor = ThreadPoolUtil.getArrayBlockingQueuePoolExecutor(
            5, 15, 1, TimeUnit.MINUTES, 20000, "listen-orgAlterInfo"
    );

    /**
     * 组织变更-发送kafka消息
     *
     * @param event
     */
    @TransactionalEventListener(OrgAlterEvent.class)
    public void orgAlterEventProcess(OrgAlterEvent<OrgEvent> event) {
        executor.execute(() -> {
            System.out.println("OrgAlterEventListener start===============");
        });
    }

    @PreDestroy
    public void destroy() {
        executor.shutdown();
    }

}
