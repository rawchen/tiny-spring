/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.io;

/**
 * 策略接口，用来加载资源。
 * Discussion: 可以根据location的不同表现形式，
 * 返回不同的Resource，故而称为策略接口。
 */
public interface ResourceLoader {

    /**
     * 加载一个资源，可以是ClassPathResource/FileSystemResource等等。
     */
    Resource getResource(String location);

    /**
     * 返回ResourceLoader在加载资源时使用的类加载器。
     */
    ClassLoader getClassLoader();
}
