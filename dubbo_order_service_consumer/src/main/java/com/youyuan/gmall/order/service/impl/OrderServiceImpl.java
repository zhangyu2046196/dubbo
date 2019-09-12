package com.youyuan.gmall.order.service.impl;

import com.youyuan.gmall.bean.UserAddress;
import com.youyuan.gmall.service.OrderService;
import com.youyuan.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangyu
 * @version 1.0
 * @description dubbo工程 订单消费接口
 * @date 2018/10/28 18:44
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    /**
     * 初始化订单 消费者
     * @param userId
     * @return
     */
    public List<UserAddress> initOrder(Long userId) {
        System.out.println("初始化订单参数userId:"+userId);
        return userService.getUserAddressList(userId);
    }
}
