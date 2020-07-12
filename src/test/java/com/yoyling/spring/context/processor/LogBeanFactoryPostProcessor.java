/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context.processor;

import com.yoyling.spring.factory.BeansException;
import com.yoyling.spring.factory.config.BeanFactoryPostProcessor;
import com.yoyling.spring.factory.config.ConfigurableListableBeanFactory;

public class LogBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("beanFactory's bean definition count is " + beanFactory.getBeanDefinitionCount());
    }

}
