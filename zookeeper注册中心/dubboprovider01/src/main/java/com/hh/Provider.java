package com.hh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: NinetyOne
 * Date: 2019/1/22
 * Time: 13:54
 * To change this template use File | Setting | File Template.
 **/
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
     context.start();
        System.out.println("Provider启动成功");
     System.in.read();
    }
}
