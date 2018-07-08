package com.pattern.observer.practice.oper;

import com.pattern.observer.practice.entity.OrderEntity;

public class LogRecord {

    public void RecordLog(OrderEntity order) {
        System.out.println("===日志记录" + order + "===");
    }

}
