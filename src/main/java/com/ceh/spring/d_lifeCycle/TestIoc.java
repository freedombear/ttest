package com.ceh.spring.d_lifeCycle;

import com.ceh.spring.a_ioc.HelloSpring;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    @Test
    public void now() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ceh/spring/a_ioc/beans.xml");
        HelloSpring helloSpring1 = applicationContext.getBean("helloSpring",HelloSpring);
        helloSpring1.service();
        applicationContext.close();

    }

}
