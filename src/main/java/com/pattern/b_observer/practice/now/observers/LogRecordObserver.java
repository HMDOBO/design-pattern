package com.pattern.b_observer.practice.now.observers;

import com.pattern.b_observer.practice.entity.OrderEntity;
import com.pattern.b_observer.practice.oper.LogRecord;

import java.util.Observable;
import java.util.Observer;

public class LogRecordObserver implements Observer {
    LogRecord logRecord = new LogRecord();
    public void update(Observable o, Object arg) {
        if (arg instanceof OrderEntity)
            logRecord.RecordLog((OrderEntity)arg);
    }
}
