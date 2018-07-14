package com.pattern.b_observer.practice.now.observers;

import com.pattern.b_observer.practice.oper.StockCount;

import java.util.Observable;
import java.util.Observer;

public class StockCoutObserver implements Observer {

    StockCount stockCount = new StockCount();

    public void update(Observable o, Object arg) {
        stockCount.reduceStock();
    }
}
