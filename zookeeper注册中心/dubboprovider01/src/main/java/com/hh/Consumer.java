package com.hh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: NinetyOne
 * Date: 2019/1/22
 * Time: 14:01
 * To change this template use File | Setting | File Template.
 **/
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hh = demoService.say("huahua");
        System.out.println(hh);

    }
}
