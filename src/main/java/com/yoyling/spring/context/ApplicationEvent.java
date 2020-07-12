/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context;

import java.util.EventObject;

/**
 * ApplicationEvent的基类，记录了事件发生的时间。
 */
public abstract class ApplicationEvent extends EventObject {

    // 事件发生的时间
    private long timestamp;

    public long getTimestamp() {
        return timestamp;
    }

    public ApplicationEvent(Object source) {
        super(source);
        this.timestamp = System.currentTimeMillis();
    }
}
