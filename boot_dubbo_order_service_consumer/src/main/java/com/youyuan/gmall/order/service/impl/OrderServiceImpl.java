package com.youyuan.gmall.order.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.youyuan.gmall.bean.UserAddress;
import com.youyuan.gmall.service.OrderService;
import com.youyuan.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhangyu
 * @description  基于spring boot的dubbo工程 消费者
 * @date 2018/10/29 14:20
 *
 * 集成spring boot步骤
 * 1、导入dubbo-start启动器jar,因为注册中心是zookeeper所以导入dubbo-start启动器后zookeeper的客户端curator默认也导入
 * 2、修改配置文件
 *  1)设置服务名称
 *  2)设置注册中心地址
 *  3)使用@Reference注解来生成远程代理接口
 *  5)连接监控中心
 *
 */
@Component
public class OrderServiceImpl implements OrderService {

    @Reference(check = true,version = "*",retries = 3)
    private UserService userService;

    /**
     * 初始化订单 消费者
     * @param userId   增加@HystrixCommand配置，这样子调用就会经过Hystrix代理
     * @return
     */
    //@HystrixCommand(fallbackMethod = "failMethod")
    public List<UserAddress> initOrder(Long userId) {
        System.out.println("初始化订单参数userId:"+userId);
        return userService.getUserAddressList(userId);
    }

    /**
     *
     * @return
     */
    public List<UserAddress> failMethod(){
        return Arrays.asList(new UserAddress(1,"测试","39","测试","测试","测试"));
    }
}
