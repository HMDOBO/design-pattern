package com.pattern.observer.subject;

import com.pattern.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {

    List<Observer> observers = new ArrayList<Observer>();

    float temperature;
    float humidity;
    float pressure;

    public void registryObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        observers.remove(i);
    }

    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public WeatherSubject() {
    }

    public WeatherSubject(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
