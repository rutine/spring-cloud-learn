package com.rutine;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2015-2016, 深圳云集智造系统技术有限公司
 *
 * @Title:
 * @Description:
 * @Author by Tine
 * @date 2017/5/9 13:48
 */
@Component
class ConsumerService {

    @KafkaListener(topics = "learn-topic")
    public void getMessage(String content, Acknowledgment ack) {
        System.out.printf("------> learn-topic[message]: %s\n", content);

        ack.acknowledge();
    }
}
