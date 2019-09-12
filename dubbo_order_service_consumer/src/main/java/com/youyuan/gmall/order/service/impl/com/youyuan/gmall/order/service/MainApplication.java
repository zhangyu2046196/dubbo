package com.youyuan.gmall.order.service.impl.com.youyuan.gmall.order.service;

import com.youyuan.gmall.bean.UserAddress;
import com.youyuan.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * @author zhangyu
 * @version 1.0
 * @description 测试消费者
 * @date 2018/10/28 21:04
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService= classPathXmlApplicationContext.getBean(OrderService.class);
        List<UserAddress> userAddressList=orderService.initOrder(1L);
        for (UserAddress userAddress:userAddressList){
            System.out.println("收货地址是:"+userAddress.getUserAddress());
        }

        System.in.read();

    }
}
