package com.youyuan.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.youyuan.gmall.bean.UserAddress;
import com.youyuan.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhangyu
 * @description  基于springboot的dubbo服务提供者
 * @date 2018/10/29 13:52
 *
 * 集成springboot步骤
 * 1、引入dubbo-start包,因为是springboot项目所以会自动引入zookeeper包
 * 2、在springboot配置文件application.yml中配置dubbo属性
 *  1)设置服务名称
 *  2)设置监控中心地址
 *  3)设置协议名和端口
 *  4)通过@Service(dubbo的service注解)来暴露远程接口
 *  5)设置连接监控中心
 *
 */
//@Service(version = "2.0.0")
public class UserServiceNewImpl implements UserService {

    /**
     * 获取用户收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(Long userId) {
        System.out.println("UserServiceImpl..new版本.....");
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
        return Arrays.asList(address1,address2);
    }
}
