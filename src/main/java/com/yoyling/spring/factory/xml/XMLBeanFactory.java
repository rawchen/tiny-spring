/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.factory.xml;

import com.yoyling.spring.factory.BeansException;
import com.yoyling.spring.factory.support.DefaultListableBeanFactory;
import com.yoyling.spring.io.Resource;

/**
 * 组合了DefaultListableBeanFactory和XMLBeanDefinitionReader。
 */
public class XMLBeanFactory extends DefaultListableBeanFactory {

    /// MARK - Properties

    // xml配置文件读取器
    private final XMLBeanDefinitionReader reader = new DefaultXMLBeanDefinitionReader(this);


    /// MARK - Initializers

    public XMLBeanFactory(Resource resource) throws BeansException {
        int numberOfBeanDefinitions = this.reader.loadBeanDefinitions(resource);
        System.out.println("一共找到" + numberOfBeanDefinitions + "个<bean>标签");
    }

}
