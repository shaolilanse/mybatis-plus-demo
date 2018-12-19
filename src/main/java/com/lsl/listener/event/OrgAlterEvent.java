package com.lsl.listener.event;

import org.springframework.context.ApplicationEvent;

/**
 * 组织变更事件
 *
 * @author liushaoli
 * @date 2018/11/16
 **/
public class OrgAlterEvent<T> extends ApplicationEvent {

    public OrgAlterEvent(T source) {
        super(source);
    }

    @Override
    public T getSource() {
        return (T) super.getSource();
    }
}
