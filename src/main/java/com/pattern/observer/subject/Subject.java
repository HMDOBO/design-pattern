package com.pattern.observer.subject;

import com.pattern.observer.observers.Observer;

public interface Subject {

    void registryObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
    void measurementsChanged();

}
