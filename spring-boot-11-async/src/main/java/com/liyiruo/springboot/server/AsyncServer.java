package com.liyiruo.springboot.server;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步任务 批量处理
 */
@Service
public class AsyncServer {
    @Async
    public void batchAdd() {
        try {
            Thread.sleep(3 * 1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("批量数据保存中");
    }
}


