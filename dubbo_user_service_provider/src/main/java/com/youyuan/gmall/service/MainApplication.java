package com.youyuan.gmall.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author zhangyu
 * @version 1.0
 * @description dubbo工程 服务提供者启动类
 * @date 2018/10/28 20:14
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cxaContent=new ClassPathXmlApplicationContext("provider.xml");
        cxaContent.start();
        System.in.read();
    }
}
