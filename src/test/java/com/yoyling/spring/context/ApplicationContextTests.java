/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context;

import com.yoyling.spring.context.support.ClassPathXMLApplicationContext;
import com.yoyling.spring.pojo.Capital;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationContextTests {

    @Test
    public void testApplicationContext() {

        ApplicationContext context = new ClassPathXMLApplicationContext("classpath:config.xml", "autowire.xml");
        Capital capital = context.getBean("capital", Capital.class);
        assertNotNull(capital);
        System.out.println(capital);

    }

    @Test
    public void testBeanFactoryPostProcessor() {
        new ClassPathXMLApplicationContext("context.xml");
    }

    @Test
    public void testApplicationListener() {
        ConfigurableApplicationContext context = new ClassPathXMLApplicationContext("context.xml");
        context.close();
    }

}
