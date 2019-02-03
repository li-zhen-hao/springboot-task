package com.atguigu.springboottask.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author li
 * 2019/2/4 1:29
 * version 1.0
 */
@Service
public class HelloService {

    @Async
    public void hello() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("加载完成...");
    }
}
