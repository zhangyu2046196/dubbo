package com.youyuan.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangyu
 * @description 基于spring boot的dubbo项目消费者启动器 @EnableDubbo注解是开启基于dubbo注解功能 @EnableHytrix开启服务熔断功能
 * @date 2018/10/29 14:24
 */
@EnableDubbo
//@EnableHystrix
@SpringBootApplication
public class BootDubboOrderServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDubboOrderServiceConsumerApplication.class, args);
	}
}
