/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context;

/**
 * 设置加载该对象的ApplicationContext。
 */
public interface ApplicationContextAware {

    /**
     * 设置加载该对象的ApplicationContext。
     */
    void setApplicationContext(ApplicationContext applicationContext);

}
