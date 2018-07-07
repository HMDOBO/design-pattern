package com.pattern.observer.test;

import com.pattern.observer.observers.CurrentConditionsDisplay;
import com.pattern.observer.observers.Observer;
import com.pattern.observer.observers.StatisticsDisplay;
import com.pattern.observer.subject.Subject;
import com.pattern.observer.subject.WeatherSubject;

public class TestObserverPattern {

    public static void main(String[] args) {
        Subject subject = new WeatherSubject(1F, 2F, 3F);

        Observer observer1 = new CurrentConditionsDisplay(subject);

        Observer observer2 = new StatisticsDisplay(subject);


        subject.measurementsChanged();

    }

}
