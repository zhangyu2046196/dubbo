package com.youyuan.gmall.order.controller;

import com.youyuan.gmall.bean.UserAddress;
import com.youyuan.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangyu
 * @version 1.0
 * @description 测试消费者
 * @date 2018/10/29 14:29
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 初始化订单获取用户收货地址
     * @param userId
     * @return
     */
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("userId")Long userId){
        return orderService.initOrder(userId);
    }

}
