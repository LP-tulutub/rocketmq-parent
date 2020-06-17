package com.rocketmq;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.rocketmq.mapper")
public class AppShopOderServiceProducer {
    public static void main(String[] args) {
        SpringApplication.run(AppShopOderServiceProducer.class, args);
    }
}
