/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.factory.config;

import com.yoyling.spring.factory.BeansException;

/**
 * Bean后置处理器，允许自定义的转换(比如包装成代理对象)。
 */
public interface BeanPostProcessor {

    /**
     * 在其他初始化方法之前调用，此时的bean已经组装完毕。
     */
    Object postProcessBeforeInitialization(Object bean, String name) throws BeansException;

    /**
     * 在其他初始化方法之后调用，此时的bean已经组装完毕。
     */
    Object postProcessAfterInitialization(Object bean, String name) throws BeansException;

}
