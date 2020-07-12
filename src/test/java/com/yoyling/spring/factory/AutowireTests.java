/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.factory;

import com.yoyling.spring.factory.pojo.Tencent;
import com.yoyling.spring.factory.support.DefaultListableBeanFactory;
import com.yoyling.spring.factory.xml.DefaultXMLBeanDefinitionReader;
import com.yoyling.spring.factory.xml.XMLBeanDefinitionReader;
import com.yoyling.spring.io.ClassPathResource;
import org.junit.Test;
import static org.junit.Assert.*;

public class AutowireTests {

    @Test
    public void testAutowire0() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XMLBeanDefinitionReader reader = new DefaultXMLBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("autowire.xml"));

        Tencent tencent = (Tencent) beanFactory.getBean("tencent");
        assertNotNull(tencent);
        assertNotNull(tencent.getCoin());
        assertEquals(tencent.getCoin().getCount(), 256);
    }
}
