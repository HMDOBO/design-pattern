package com.pattern.observer.practice.now.observers;

import com.pattern.observer.practice.entity.OrderEntity;
import com.pattern.observer.practice.oper.ParentOrder;

import java.util.Observable;
import java.util.Observer;

public class ParentOrderObserver implements Observer {
    ParentOrder parentOrder = new ParentOrder();
    public void update(Observable o, Object arg) {
        if (arg instanceof OrderEntity)
            parentOrder.createParentOrder((OrderEntity)arg);
    }
}
