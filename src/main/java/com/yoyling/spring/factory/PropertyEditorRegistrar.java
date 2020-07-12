/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.factory;

/**
 * 策略接口，用于向PropertyEditorRegistry注册自定义编辑器。
 */
public interface PropertyEditorRegistrar {

    /**
     * 通过PropertyEditorRegistry注册自定义PropertyEditor。
     */
    void registerCustomEditors(PropertyEditorRegistry registry);

}
