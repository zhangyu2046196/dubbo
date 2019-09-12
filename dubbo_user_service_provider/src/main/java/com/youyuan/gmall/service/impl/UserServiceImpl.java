package com.youyuan.gmall.service.impl;

import com.youyuan.gmall.bean.UserAddress;
import com.youyuan.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhangyu
 * @version 1.0
 * @description dubbo工程 用户地址实现
 * @date 2018/10/28 18:40
 *
 * 开发服务提供者步骤
 * 1、服务提供者注册到注册中心
 *    1)maven引入dubbo的依赖包(2.6.2)
 *    2)因为注册中心是用的zookeeper,索引需要引入zookeeper的客户端包
 *    3)编写配置文件provider.xml
 * 2、消费者从注册中心订阅服务提供者的服务地址
 */
public class UserServiceImpl implements UserService {

    /**
     * 获取用户收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(Long userId) {
        System.out.println("UserServiceImpl..3.....");
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
        return Arrays.asList(address1,address2);
    }
}
