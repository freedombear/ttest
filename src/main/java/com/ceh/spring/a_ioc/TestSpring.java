package com.ceh.spring.a_ioc;

import com.ceh.spring.b_di.DISpring;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
/*
    @Test
    public void before() {
        HelloSpring helloSpring = new HelloSpring();
        helloSpring.setInfo("芜湖班的同学你们好");
        System.out.println(helloSpring.getInfo());
    }
*/
    @Test
    public void before() {
        HelloSpring helloSpring = new HelloSpring();
        DISpring diSpring = new DISpring();
        helloSpring.setDiSpring(diSpring);
        helloSpring.helloDI("hello  di");

    }

    @Test
    public void now() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ceh/spring/a_ioc/beans.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.helloDI("hello spring di");
       // helloSpring.setInfo("spring:芜湖班的同学你们好啊");
        //System.out.println(helloSpring.getInfo());
    }

}
