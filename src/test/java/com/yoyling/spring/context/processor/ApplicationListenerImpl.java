/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context.processor;

import com.yoyling.spring.context.ApplicationEvent;
import com.yoyling.spring.context.ApplicationListener;

public class ApplicationListenerImpl implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("onApplicationEvent " + event);
    }
}
