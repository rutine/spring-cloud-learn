package com.rutine;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @Title:
 * @Description:
 * @Author by Tine
 * @date 2017/5/9 10:47
 */
@Component
class ProducerService implements InitializingBean {

    @Autowired
    private KafkaTemplate kafkaTemplate;


    public void sendMessage() {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    kafkaTemplate.send("learn-topic", "key", "Hello World");
                   try {
                       sleep(10000);
                   } catch (Exception e) {

                   }
                }
            }
        }.start();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.sendMessage();
    }
}
