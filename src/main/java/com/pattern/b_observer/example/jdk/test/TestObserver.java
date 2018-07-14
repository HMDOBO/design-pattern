package com.pattern.b_observer.example.jdk.test;

import com.pattern.b_observer.example.jdk.observerable.WeatherData;
import com.pattern.b_observer.example.jdk.observers.CurrentConditionsDisplay;
import com.pattern.b_observer.example.jdk.observers.StatisticwDisplay;
import com.pattern.b_observer.example.jdk.vo.WeatherVO;

public class TestObserver {

    public static void main(String[] args) {
        WeatherVO vo = new WeatherVO(1, 2, 3);
        WeatherData weatherData = new WeatherData(vo);

        CurrentConditionsDisplay observer1 = new CurrentConditionsDisplay();
        weatherData.addObserver(observer1);

        StatisticwDisplay observer2 = new StatisticwDisplay();
        weatherData.addObserver(observer2);

        weatherData.measurementsChanged();

    }

}
