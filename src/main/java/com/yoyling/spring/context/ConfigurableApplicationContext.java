/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context;

import com.yoyling.spring.factory.BeansException;
import com.yoyling.spring.factory.config.BeanFactoryPostProcessor;
import com.yoyling.spring.factory.config.ConfigurableListableBeanFactory;

/**
 * 类似于BeanFactory设计，ApplicationContext也只是一个功能最小的接口，
 * ConfigurableApplicationContext在此基础之上扩充了它的功能。
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 添加一个BeanFactory后置处理器。
     */
    void addBeanFactoryPostProcessor(BeanFactoryPostProcessor beanFactoryPostProcessor);

    /**
     * 添加一个ApplicationListener用来接收ApplicationContext的开启、关闭、刷新等事件。
     */
    void addApplicationListener(ApplicationListener listener);

    /**
     * 刷新ApplicationContext。
     */
    void refresh() throws BeansException, IllegalStateException;

    /**
     * 关闭当前ApplicationContext。
     */
    void close();

    /**
     * 返回当前ApplicationContext内部组合的BeanFactory，一般在框架内部使用。
     */
    ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException;

}
