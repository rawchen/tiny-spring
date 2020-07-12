/*
 * Github: https://github.com/yoyling
 * Created by yoyling on 2020/07/12.
 * All rights reserved.
 */

package com.yoyling.spring.factory.xml;

import com.yoyling.spring.factory.support.BeanDefinitionRegistry;
import com.sun.istack.internal.NotNull;
import org.w3c.dom.Document;

/**
 * 对xml配置文件解析器的抽象。
 * 这是一个策略接口，XMLBeanDefinitionReader通过
 * XMLBeanDefinitionParser来做具体的解析。
 * @see XMLBeanDefinitionReader
 */
public interface XMLBeanDefinitionParser {

    /**
     * 读取<bean>标签的定义生成BeanDefinition，再通过
     * BeanDefinitionRegistry注册进BeanFactory。
     * @param document 代表xml配置文件的Document对象
     * @param classLoader 加载<bean>标签对应JavaBean的类加载器
     * @param registry 用来注册BeanDefinition的注册器
     */
    int registerBeanDefinitions(@NotNull Document document,
                                @NotNull ClassLoader classLoader,
                                @NotNull BeanDefinitionRegistry registry);

}
