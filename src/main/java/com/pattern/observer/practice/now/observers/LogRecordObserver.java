package com.pattern.observer.practice.now.observers;

import com.pattern.observer.practice.entity.OrderEntity;
import com.pattern.observer.practice.oper.LogRecord;

import java.util.Observable;
import java.util.Observer;

public class LogRecordObserver implements Observer {
    LogRecord logRecord = new LogRecord();
    public void update(Observable o, Object arg) {
        if (arg instanceof OrderEntity)
            logRecord.RecordLog((OrderEntity)arg);
    }
}
