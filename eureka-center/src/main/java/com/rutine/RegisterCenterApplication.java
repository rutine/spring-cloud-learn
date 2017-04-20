package com.rutine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @Title: 服务注册中心
 * @Description:
 * @Author by Tine
 * @date 2017/4/18 19:50
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterApplication.class, args);
    }

    private void doTest() {}
}
