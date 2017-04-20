package com.rutine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @Title: HELLO服务
 * @Description:
 * @Author by Tine
 * @date 2017/4/18 20:16
 */
@EnableEurekaClient
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    private void doTest() {}
}
