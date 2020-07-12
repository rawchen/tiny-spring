/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context;

import com.yoyling.spring.io.ResourceLoader;

/**
 * 设置加载该对象的ResourceLoader。
 */
public interface ResourceLoaderAware {

    /**
     * 设置加载该对象的ResourceLoader。
     */
    void setResourceLoader(ResourceLoader resourceLoader);
}
