package org.luoxiluo.观察者模式;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: luoxiluo
 * @CreateTime 2023/8/20
 */
public class CurrentCondtionDisplay implements Observer,DisplayElement{

    private float temperature;

    private float humidity;
    /**
     * 保持引用
     */
    private Subject subject;

    public CurrentCondtionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void displiay() {
        System.out.println("CurrentCondtionDisplay:");
        System.out.println("temperature - > "+temperature);
        System.out.println("humidity - > "+humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        displiay();
    }
}
