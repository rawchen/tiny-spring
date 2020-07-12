/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context;

/**
 * 应用程序事件派发器，封装了事件的派发逻辑，一般作为
 * ApplicationContext的父接口使用。
 */
public interface ApplicationEventPublisher {

    /**
     * 派发一个ApplicationEvent，并通知所有已注册的ApplicationListener。
     */
    void publishEvent(ApplicationEvent event);

}
