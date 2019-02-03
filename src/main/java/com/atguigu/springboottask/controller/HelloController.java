package com.atguigu.springboottask.controller;

import com.atguigu.springboottask.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author li
 * 2019/2/4 1:31
 * version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        try {
            helloService.hello();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
