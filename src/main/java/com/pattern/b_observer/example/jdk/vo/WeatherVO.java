package com.pattern.b_observer.example.jdk.vo;

public class WeatherVO {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherVO(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "WeatherVO{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
