package com.pattern.b_observer.practice.now.observerable;

import com.pattern.b_observer.practice.entity.OrderEntity;
import com.pattern.b_observer.practice.now.observers.*;

import java.util.Observable;

public class OrderObservable extends Observable {

    public void notifyCreateOrder(OrderEntity order) {
        ChildrenOrderObserver childrenOrderObserver = new ChildrenOrderObserver();
        LogRecordObserver logRecordObserver = new LogRecordObserver();
        ParentOrderObserver parentOrderObserver = new ParentOrderObserver();
        RecordInfoObserver recordInfoObserver = new RecordInfoObserver();
        StockCoutObserver stockCoutObserver = new StockCoutObserver();
        addObserver(childrenOrderObserver);
        addObserver(logRecordObserver);
        addObserver(parentOrderObserver);
        addObserver(recordInfoObserver);
        addObserver(stockCoutObserver);

        notify(order);
    }

    public void notify(OrderEntity order) {
        setChanged();
        notifyObservers(order);
    }

}
