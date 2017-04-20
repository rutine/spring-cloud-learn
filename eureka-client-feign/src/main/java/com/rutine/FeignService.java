package com.rutine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @Title:
 * @Description:
 * @Author by Tine
 * @date 2017/4/19 12:56
 */
@RestController
public class FeignService {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello() {
        return helloService.sayHello("feign");
    }
}
