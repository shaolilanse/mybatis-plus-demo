package com.lsl.util.threadPool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

/**
 * Copyright (c) 2018. All Rights Reserved.
 * Created by KangXuechao on 2018-08-13 上午11:34
 */
public class ThreadPoolUtil {

    private static final Logger logger = LoggerFactory.getLogger(ThreadPoolUtil.class);

    public static ThreadPoolExecutor integratedEmployeeExecutor =
            ThreadPoolUtil.getArrayBlockingQueuePoolExecutor(
                    10, 10, 1, TimeUnit.MINUTES, 20000, "integrated-employee"
            );


    public static ThreadPoolExecutor getArrayBlockingQueuePoolExecutor(int corePoolSize
            , int maximumPoolSize
            , long keepAliveTime
            , TimeUnit unit
            , int blockingQueueSize
            , final String tag) {

        logger.info("create thread pool with blocking array queue, tag : {}, corePoolSize : {}, maximumPoolSize : {}"
                        + ", keepAliveTime : {}, unit : {}, blockingQueueSize : {}"
                , tag
                , corePoolSize
                , maximumPoolSize
                , keepAliveTime
                , unit
                , blockingQueueSize);

        return new ThreadPoolExecutor(corePoolSize
                , maximumPoolSize
                , keepAliveTime
                , unit
                , new ArrayBlockingQueue<Runnable>(blockingQueueSize)
                , new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName(tag + "_thread");
                return thread;
            }
        }
                , new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                logger.error(
                        tag + "_thread_full:queue_size={}, ActiveCount={}, CorePoolSize={}, CompletedTaskCount={}",
                        executor.getQueue().size(), executor.getActiveCount(), executor.getCorePoolSize(),
                        executor.getCompletedTaskCount());
            }
        }
        );
    }


}
