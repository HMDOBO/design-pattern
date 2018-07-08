package com.pattern.observer.practice.now.observers;

import com.pattern.observer.practice.entity.OrderEntity;
import com.pattern.observer.practice.oper.ChildrenOrder;

import java.util.Observable;
import java.util.Observer;

public class ChildrenOrderObserver implements Observer {
    ChildrenOrder childrenOrder = new ChildrenOrder();
    public void update(Observable o, Object arg) {
        if (arg instanceof OrderEntity)
            childrenOrder.createChildrenOrder((OrderEntity)arg);
    }
}
