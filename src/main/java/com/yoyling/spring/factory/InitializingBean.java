/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.factory;

/**
 * Bean的生命周期标记接口。
 */
public interface InitializingBean {

    /**
     * 在bean的属性被赋值后调用
     */
    void afterPropertiesSet() throws Exception;
}
