/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.factory.config;

import com.yoyling.spring.factory.BeansException;
import com.yoyling.spring.factory.PropertyEditorRegistrar;

/**
 * 用来帮助注册自定义PropertyEditor的BeanFactory后置处理器。
 */
public class CustomEditorConfigurer implements BeanFactoryPostProcessor {

    // PropertyEditor注册器
    private PropertyEditorRegistrar[] propertyEditorRegistrars;

    public void setPropertyEditorRegistrars(PropertyEditorRegistrar[] propertyEditorRegistrars) {
        this.propertyEditorRegistrars = propertyEditorRegistrars;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        if (propertyEditorRegistrars != null) {
            for (PropertyEditorRegistrar registrar : propertyEditorRegistrars) {
                beanFactory.addPropertyEditorRegistrar(registrar);
            }
        }
    }
}
