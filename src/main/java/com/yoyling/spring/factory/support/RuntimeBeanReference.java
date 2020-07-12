/*
 * Github: https://github.com/yoyling
 * Created by yoyling on 2020/07/12.
 * All rights reserved.
 */

package com.yoyling.spring.factory.support;

/**
 * 用来标识<ref>标签对另一个bean的引用。
 */
public class RuntimeBeanReference {

    // 所指向的另一个bean的名字
    private final String beanName;

    public RuntimeBeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public String toString() {
        return "RuntimeBeanReference{" +
                "beanName='" + beanName + '\'' +
                '}';
    }

}
