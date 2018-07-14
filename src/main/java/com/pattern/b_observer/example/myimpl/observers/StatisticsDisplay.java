package com.pattern.b_observer.example.myimpl.observers;

import com.pattern.b_observer.example.myimpl.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement{

    float temperature;
    float humidity;
    float pressure;
    Subject observer;

    public StatisticsDisplay(Subject observer) {
        this.observer = observer;
        observer.registryObserver(this);
    }

    public void display() {
        System.out.println(toString());
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public String toString() {
        return "StatisticsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
