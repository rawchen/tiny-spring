/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.factory;

/**
 * Bean的生命周期标记接口。
 */
public interface DisposableBean {

    /**
     * 在BeanFactory销毁单例bean时调用
     */
    void destroy() throws Exception;
}
