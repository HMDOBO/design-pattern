package com.pattern.observer.example.myimpl.test;

import java.util.Vector;

public class TestObserverPattern {

    public static void main(String[] args) {
//        Subject subject = new WeatherSubject(1F, 2F, 3F);
//
//        Observer observer1 = new CurrentConditionsDisplay(subject);
//
//        Observer observer2 = new StatisticsDisplay(subject);
//
//
//        subject.measurementsChanged();


        Vector<String> v = new Vector<String>();
        v.addElement("123");
        v.addElement("456");
        v.addElement("789");
        v.add("123");
        System.out.println(v);

    }

}
