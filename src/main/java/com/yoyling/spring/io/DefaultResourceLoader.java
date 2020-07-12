/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.io;

import com.yoyling.spring.utils.ClassUtils;
import java.util.Objects;

/**
 * ResourceLoader的默认实现。
 */
public class DefaultResourceLoader implements ResourceLoader {

    /// MARK - Properties

    // 加载资源的类加载器
    private ClassLoader classLoader;

    /// MARK - Getters & Setters

    public void setClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public ClassLoader getClassLoader() {
        return this.classLoader;
    }

    /// MARK - Initializers

    public DefaultResourceLoader() {
        this.classLoader = ClassUtils.getDefaultClassLoader();
    }

    public DefaultResourceLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    /// MARK - ResourceLoader

    public Resource getResource(String location) {
        Objects.requireNonNull(location, "location不能为空");
        if (location.startsWith(Resource.CLASSPATH_URL_PREFIX)) {
            return new ClassPathResource(location.substring(Resource.CLASSPATH_URL_PREFIX.length()), getClassLoader());
        } else {
            // 之所以称为策略接口，是因为可以根据location
            // 的不同表现形式，返回不同的Resource，只不过
            // 我们这里只有ClassPathResource得到了支持而已。
            throw new RuntimeException("tiny-spring仅支持ClassPathResource");
        }
    }
}
