/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.factory;

import com.yoyling.spring.factory.support.DefaultListableBeanFactory;
import com.yoyling.spring.factory.xml.DefaultXMLBeanDefinitionReader;
import com.yoyling.spring.factory.xml.XMLBeanDefinitionReader;
import com.yoyling.spring.io.ClassPathResource;
import com.yoyling.spring.pojo.Capital;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeanFactoryTests {

    @Test
    public void testBeanFactory0() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XMLBeanDefinitionReader reader = new DefaultXMLBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("config.xml"));
        Capital capital = (Capital) beanFactory.getBean("capital");
        assertNotNull(capital);
        System.out.println(capital);
    }
}
