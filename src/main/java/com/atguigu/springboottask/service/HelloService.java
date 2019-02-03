package com.atguigu.springboottask.service;

import org.springframework.stereotype.Service;

/**
 * @author li
 * 2019/2/4 1:29
 * version 1.0
 */
@Service
public class HelloService {

    public void hello() throws InterruptedException {
        Thread.sleep(3000);
    }
}
