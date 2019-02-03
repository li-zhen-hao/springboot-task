package com.atguigu.springboottask.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author li
 * 2019/2/4 2:07
 * version 1.0
 */
@Service
public class ScheduledService {

    @Scheduled(cron = "0/5 * * * * 0-7")
    public void scheduled(){
        System.out.println("启动.."+new Date().getMinutes()+":"+new Date().getSeconds());
    }
}
