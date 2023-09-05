package org.luoxiluo.观察者模式;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/8/20
 */
public class WeatherData implements Subject{

    private ArrayList<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver() {

        for (Observer obs : observers) {
            obs.update(temperature,humidity,pressure);
        }
    }


    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObserver();
    }


}
