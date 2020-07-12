/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context;

import java.util.EventListener;

/**
 * 应用程序事件监听器，观察者模式的应用。
 */
public interface ApplicationListener extends EventListener {

    /**
     * 接收到ApplicationEvent的回调
     */
    void onApplicationEvent(ApplicationEvent event);
}
