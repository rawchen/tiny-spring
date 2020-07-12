/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context.event;

import com.yoyling.spring.context.ApplicationContext;
import com.yoyling.spring.context.ApplicationEvent;

/**
 * ApplicationContext关闭事件。
 */
public class ContextClosedEvent extends ApplicationEvent {

    public ContextClosedEvent(ApplicationContext context) {
        super(context);
    }
}
