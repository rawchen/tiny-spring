/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context.event;

import com.yoyling.spring.context.ApplicationEvent;
import com.yoyling.spring.context.ApplicationListener;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * ApplicationEventMulticaster的默认实现。
 */
public class DefaultApplicationEventMulticaster implements ApplicationEventMulticaster {

    /// MARK - Properties

    // 已注册的ApplicationListener
    private Set<ApplicationListener> registeredListeners = new CopyOnWriteArraySet<>();

    /// MARK - Getters & Setters

    public Set<ApplicationListener> getApplicationListeners() {
        return Collections.unmodifiableSet(registeredListeners);
    }

    /// MARK - ApplicationEventMulticaster

    @Override
    public void addApplicationListener(ApplicationListener listener) {
        registeredListeners.add(listener);
    }

    @Override
    public void removeApplicationListener(ApplicationListener listener) {
        registeredListeners.remove(listener);
    }

    @Override
    public void removeAllListeners() {
        registeredListeners.clear();
    }

    @Override
    public void multicastEvent(ApplicationEvent event) {
        registeredListeners.forEach((listener) -> listener.onApplicationEvent(event));
    }

}
