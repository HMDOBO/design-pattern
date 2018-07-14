package com.pattern.b_observer.example.myimpl.subject;

import com.pattern.b_observer.example.myimpl.observers.Observer;

public interface Subject {

    void registryObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
    void measurementsChanged();

}
