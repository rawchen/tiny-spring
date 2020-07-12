/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.factory;

import com.yoyling.spring.pojo.Car;
import com.yoyling.spring.pojo.Person;
import org.junit.Test;
import static org.junit.Assert.*;

public class TypeConverterTests {

    @Test
    public void test0() {
        BeanWrapper wrapper = new BeanWrapper(Car.class);
        wrapper.setPropertyValue("price", "150000");
        Car car = (Car) wrapper.getWrappedInstance();
        assertEquals(car.getPrice(), 150000, 0);
        wrapper.setPropertyValue("brand", "BYD");
        assertEquals(car.getBrand(), "BYD");
    }

    @Test
    public void test1() {
        Person saber = new Person();
        BeanWrapper wrapper = new BeanWrapper(saber);
        wrapper.setPropertyValue("name", "saber");
        wrapper.setPropertyValue("age", "22");
        assertEquals(saber.getAge(), 22);
        assertEquals(saber.getName(), "saber");
    }
}
