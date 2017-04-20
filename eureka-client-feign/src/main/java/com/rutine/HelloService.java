package com.rutine;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @Title:
 * @Description:
 * @Author by Tine
 * @date 2017/4/19 12:54
 */
@FeignClient(value = "server-hello")
public interface HelloService {

    @RequestMapping("/hello")
    String sayHello(@RequestParam("name") String name);
}
