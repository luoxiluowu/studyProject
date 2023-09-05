package org.luoxiluo.观察者模式;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/8/20
 */
public class WeathStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondtionDisplay currentCondtionDisplay = new CurrentCondtionDisplay(weatherData);
        weatherData.setMeasurements(80,65,20.3f);

    }
}
