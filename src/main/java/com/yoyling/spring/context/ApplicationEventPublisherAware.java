/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context;

/**
 * 设置加载该对象的ApplicationEventPublisherAware。
 */
public interface ApplicationEventPublisherAware {

    /**
     * 设置加载该对象的ApplicationEventPublisherAware。
     */
    void setApplicationEventPublisher(ApplicationEventPublisher eventPublisher);

}
