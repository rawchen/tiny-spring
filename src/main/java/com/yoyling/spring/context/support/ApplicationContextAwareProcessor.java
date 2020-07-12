/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context.support;

import com.yoyling.spring.context.ApplicationContext;
import com.yoyling.spring.context.ApplicationContextAware;
import com.yoyling.spring.context.ApplicationEventPublisherAware;
import com.yoyling.spring.context.ResourceLoaderAware;
import com.yoyling.spring.factory.BeansException;
import com.yoyling.spring.factory.config.BeanPostProcessor;

/**
 * 用来处理实现了ApplicationContextAware或ResourceLoaderAware的bean，
 * 给它们注入相应的依赖。
 * ApplicationContext会自动注册这个bean后置处理器。
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        if (bean instanceof ResourceLoaderAware) {
            ((ResourceLoaderAware) bean).setResourceLoader(this.applicationContext);
        }
        if (bean instanceof ApplicationEventPublisherAware) {
            ((ApplicationEventPublisherAware) bean).setApplicationEventPublisher(this.applicationContext);
        }
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(this.applicationContext);
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
        return bean;
    }
}
