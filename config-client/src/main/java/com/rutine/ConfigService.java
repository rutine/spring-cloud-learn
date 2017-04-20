package com.rutine;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Title:
 * @Description:
 * @Author by Tine
 * @date 2017/4/20 12:39
 */
@RestController
public class ConfigService {

    @Value("${message}")
    private String message;

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return message;
    }
}
