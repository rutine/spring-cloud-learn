package com.rutine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @Title:
 * @Description:
 * @Author by Tine
 * @date 2017/4/18 21:03
 */
@RestController
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String sayHello() {
        return restTemplate.getForObject("http://SERVER-HELLO/hello?name=ribbon", String.class);
    }
}
