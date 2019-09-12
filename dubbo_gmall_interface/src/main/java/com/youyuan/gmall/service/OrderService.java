package com.youyuan.gmall.service;

import com.youyuan.gmall.bean.UserAddress;

import java.util.List;

/**
 * @author zhangyu
 * @description dubbo工程 consumer订单接口
 * @date 2018/10/28 18:34
 */
public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(Long userId);

}
