/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context.processor;

import com.yoyling.spring.factory.PropertyEditorRegistrar;
import com.yoyling.spring.factory.PropertyEditorRegistry;

import java.beans.PropertyEditor;
import java.util.Date;

public class DatePropertyEditorRegistrar implements PropertyEditorRegistrar {

    private PropertyEditor propertyEditor;

    public PropertyEditor getPropertyEditor() {
        return propertyEditor;
    }

    public void setPropertyEditor(PropertyEditor propertyEditor) {
        this.propertyEditor = propertyEditor;
    }

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Date.class, propertyEditor);
    }
}
