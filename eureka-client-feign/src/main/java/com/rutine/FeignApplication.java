package com.rutine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *
 * @Title: 注解式消费服务
 * @Description:
 * @Author by Tine
 * @date 2017/4/19 12:45
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

    private void doTest() {}
}
