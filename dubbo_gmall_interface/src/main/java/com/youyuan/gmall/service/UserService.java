package com.youyuan.gmall.service;

import com.youyuan.gmall.bean.UserAddress;

import java.util.List;


/**
 * @author zhangyu
 * @description dubbo工程 provider提供收货地址用户接口
 * @date 2018/10/28 18:33
 */
public interface UserService {
	
	/**
	 * 按照用户id返回所有的收货地址
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(Long userId);

}
