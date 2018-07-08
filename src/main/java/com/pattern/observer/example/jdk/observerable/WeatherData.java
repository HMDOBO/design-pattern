package com.pattern.observer.example.jdk.observerable;


import com.pattern.observer.example.jdk.vo.WeatherVO;

import java.util.Observable;

public class WeatherData extends Observable {

    private WeatherVO vo;

    public WeatherData(WeatherVO vo) {
        this.vo = vo;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers(vo);
    }

    public WeatherVO getVo() {
        return vo;
    }
    public void setVo(WeatherVO vo) {
        this.vo = vo;
    }
}
