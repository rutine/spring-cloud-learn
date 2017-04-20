package com.rutine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * @Title: 配置服务
 * @Description:
 * @Author by Tine
 * @date 2017/4/19 19:40
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

    private void doTest() {}
}
