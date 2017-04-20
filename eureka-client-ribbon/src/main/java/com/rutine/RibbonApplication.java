package com.rutine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @Title: 消费服务
 * @Description:
 * @Author by Tine
 * @date 2017/4/18 20:56
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }


    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
