package com.rutine;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Title: 提供具体的服务
 * @Description:
 * @Author by Tine
 * @date 2017/4/18 20:46
 */
@RestController
public class HelloService {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name){
        return "Hello, " + name + ", Message from [HELLO SERVER] at port: " + port;
    }
}
