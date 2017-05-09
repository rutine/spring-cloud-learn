package com.rutine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 需先下载zookeeper和kafka, 使用默认配置启动服务
 *
 * @Title: kafka生产者应用
 * @Description:
 * @Author by Tine
 * @date 2017/5/9 10:32
 */
@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    private void doTest() {}
}
