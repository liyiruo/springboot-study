package com.liyiruo.springboot.server;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    private static int count=0;
    @Scheduled(cron = "*/3 * * * * MON-FRI")
    public void count() {
        System.out.println("第" + count++ + "执行");
    }
}
