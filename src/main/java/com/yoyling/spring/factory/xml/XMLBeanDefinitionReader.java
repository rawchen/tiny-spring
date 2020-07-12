/*
 * Github: https://github.com/yoyling
 * Created by yoyling on 2020/07/12.
 * All rights reserved.
 */

package com.yoyling.spring.factory.xml;

import com.yoyling.spring.io.Resource;

import com.sun.istack.internal.NotNull;

/**
 * 对xml配置文件读取器的抽象。
 * 读取器最主要的目的是读取一个个<bean>标签，
 * 解析出其中的信息，生成对应的BeanDefinition。
 * @see com.yoyling.spring.factory.config.BeanDefinition
 */
public interface XMLBeanDefinitionReader {

    /**
     * 加载bean的定义信息。
     * @param resource 代表一个xml配置文件
     */
    int loadBeanDefinitions(@NotNull Resource resource);

}
