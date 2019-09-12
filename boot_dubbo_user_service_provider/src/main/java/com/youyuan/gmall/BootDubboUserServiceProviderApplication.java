package com.youyuan.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangyu
 * @description  基于spring boot的服务提供者主程序  @EnableDubbo代表打开基于dubbo的注解功能  @EnableHytrix开启服务熔断模式
 * @date 2018/10/29 14:09
 */
@EnableDubbo
//@EnableHytrix
@SpringBootApplication
public class BootDubboUserServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDubboUserServiceProviderApplication.class, args);
	}
}
