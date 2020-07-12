/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context;

import com.yoyling.spring.factory.ListableBeanFactory;
import com.yoyling.spring.io.ResourceLoader;

/**
 * 在BeanFactory之上集成许多易用的功能，更加方便客户端的使用，比如资源加载、事件派发等等。
 */
public interface ApplicationContext extends ResourceLoader, ListableBeanFactory, ApplicationEventPublisher {

    /**
     * 返回ApplicationContext的名称
     */
    String getDisplayName();

    /**
     * 返回ApplicationContext的启动时间
     */
    long getStartupDate();

}
