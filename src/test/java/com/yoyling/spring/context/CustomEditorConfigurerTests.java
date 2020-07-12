/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context;

import com.yoyling.spring.context.processor.DateHolder;
import com.yoyling.spring.context.support.ClassPathXMLApplicationContext;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomEditorConfigurerTests {

    @Test
    public void testCustomEditorConfigurer() {
        ApplicationContext context = new ClassPathXMLApplicationContext("context.xml");
        DateHolder dateHolder = context.getBean("date-holder", DateHolder.class);
        assertNotNull(dateHolder);
        assertNotNull(dateHolder.getDate());
        System.out.println(dateHolder);
    }
}
