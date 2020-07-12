/*
 *  Github: https://github.com/yoyling
 *  Created by yoyling on 2020/07/12.
 *  All rights reserved.
 */

package com.yoyling.spring.factory.pojo;

import com.yoyling.spring.factory.BeanFactory;
import com.yoyling.spring.factory.BeanFactoryAware;
import com.yoyling.spring.factory.BeanNameAware;

// 腾讯服务需要Q币初始化，2333
public class Tencent implements BeanNameAware, BeanFactoryAware {

    private QQCoin coin;

    public Tencent(QQCoin coin) {
        this.coin = coin;
    }

    public QQCoin getCoin() {
        return coin;
    }

    public void setCoin(QQCoin coin) {
        this.coin = coin;
    }

    @Override
    public String toString() {
        return "Tencent{" +
                "coin=" + coin +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory factory) {
        System.out.println("Tencent invoke setBeanFactory " + factory);
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Tencent invoke setBeanName " + beanName);
    }
}
