package com.ceh.spring.a_ioc;

import com.ceh.spring.b_di.DISpring;

public class HelloSpring {
    private String info="生命周期";

      public void initBean(){
        System.out.println("数据库连接配置完成");
    }

    public void destroyBean(){
        System.out.println("当前数据库连接已经被关闭");
    }

    public void service(){
        System.out.println("bean已经装配好了");
    }

    private volatile int count = 0;

    public void addCount() {
        count++;
    }

    public void helloDI(String msg) {
        this.diSpring.helloDI(msg);
    }


    private DISpring diSpring;

    public DISpring getDiSpring() {
        return diSpring;
    }

    public void setDiSpring(DISpring diSpring) {
        this.diSpring = diSpring;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


}
