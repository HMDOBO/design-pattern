package com.pattern.observer.example.jdk.observers;


import com.pattern.observer.example.jdk.vo.WeatherVO;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private WeatherVO vo;

    public void update(Observable o, Object arg) {
        if (arg instanceof WeatherVO) {
            vo = (WeatherVO)arg;
            display();
        }
    }

    public void display() {
        System.out.println(vo);
    }

    public WeatherVO getVo() {
        return vo;
    }
    public void setVo(WeatherVO vo) {
        this.vo = vo;
    }
}
