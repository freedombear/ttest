package com.ceh.spring.d_lifeCycle;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitializtion(Object o, String s) throws Exception {
        System.out.println("初始前");
        return null;
    }

    public Object postProcessAfterInitializtion(Object o, String s) throws Exception {
        System.out.println("初始后");
        return null;
    }
}

