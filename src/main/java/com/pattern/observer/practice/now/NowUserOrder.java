package com.pattern.observer.practice.now;

import com.pattern.observer.practice.entity.OrderEntity;
import com.pattern.observer.practice.now.observerable.OrderObservable;

public class NowUserOrder {

    /**
     * 使用观察者模式
     *
     * 用户下单
     * @param order
     */
    public void order(OrderEntity order) {

        OrderObservable observable = new OrderObservable();
        observable.notifyCreateOrder(order);

    }

}
