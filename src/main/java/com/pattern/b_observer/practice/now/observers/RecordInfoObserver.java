package com.pattern.b_observer.practice.now.observers;

import com.pattern.b_observer.practice.entity.OrderEntity;
import com.pattern.b_observer.practice.oper.RecordInfo;

import java.util.Observable;
import java.util.Observer;

public class RecordInfoObserver implements Observer {
    RecordInfo recordInfo = new RecordInfo();
    public void update(Observable o, Object arg) {
        if (arg instanceof OrderEntity)
            recordInfo.RecordUserOrder((OrderEntity)arg);
    }
}
