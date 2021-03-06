package com.pattern.b_observer.practice;

import com.pattern.b_observer.practice.entity.OrderEntity;
import com.pattern.b_observer.practice.now.NowUserOrder;
import com.pattern.b_observer.practice.old.OldUserOrder;

public class TestCreateOrder {

    public static void main(String[] args) {
        OrderEntity order = new OrderEntity(1L, 2L, "iPhone X", 888800L);

        // 传统方式
        OldUserOrder oldUserOrder = new OldUserOrder();
        oldUserOrder.order(order);

        System.out.println("================================");

        // 使用观察者模式
        NowUserOrder nowUserOrder = new NowUserOrder();
        nowUserOrder.order(order);
    }

}
