package com.pattern.observer.practice.old;

import com.pattern.observer.practice.entity.OrderEntity;
import com.pattern.observer.practice.oper.*;

public class OldUserOrder {

    /**
     * 用户下单操作
     */
    public void order(OrderEntity order) {

        // 1. 减库存
        StockCount stockCount = new StockCount();
        stockCount.reduceStock();
        // 2. 插入父订单表
        ParentOrder parentOrder = new ParentOrder();
        parentOrder.createParentOrder(order);
        // 3. 插入子订单表
        ChildrenOrder childrenOrder = new ChildrenOrder();
        childrenOrder.createChildrenOrder(order);
        // 4. 记录购买信息
        RecordInfo recordInfo = new RecordInfo();
        recordInfo.RecordUserOrder(order);
        // 5. 日志记录
        LogRecord logRecord = new LogRecord();
        logRecord.RecordLog(order);

    }

}
