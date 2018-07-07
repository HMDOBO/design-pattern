package com.pattern.observer.observers;

import com.pattern.observer.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    float temperature;
    float humidity;
    Subject observer;

    public CurrentConditionsDisplay(Subject observer) {
        this.observer = observer;
        observer.registryObserver(this);
    }

    public void display() {
        System.out.println(toString());
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
