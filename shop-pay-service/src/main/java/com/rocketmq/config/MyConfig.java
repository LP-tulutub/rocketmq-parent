package com.rocketmq.config;

import com.rocketmq.utils.IDWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public IDWorker idWorker(){
        return new IDWorker(1, 1);
    }

}
