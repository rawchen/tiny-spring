/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.context;

/**
 * ApplicationContext相关的异常。
 */
public class ApplicationContextException extends RuntimeException {

    public ApplicationContextException(String message) {
        super(message);
    }

    public ApplicationContextException(Throwable throwable) {
        super(throwable);
    }

    public ApplicationContextException(String message, Throwable cause) {
        super(message, cause);
    }

}
