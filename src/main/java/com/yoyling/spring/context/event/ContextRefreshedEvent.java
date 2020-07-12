/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context.event;

import com.yoyling.spring.context.ApplicationContext;
import com.yoyling.spring.context.ApplicationEvent;

/**
 * ApplicationContext初始化或刷新事件。
 */
public class ContextRefreshedEvent extends ApplicationEvent {

    public ContextRefreshedEvent(ApplicationContext context) {
        super(context);
    }
}
