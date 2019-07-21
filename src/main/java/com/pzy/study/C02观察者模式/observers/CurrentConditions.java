package com.pzy.study.C02观察者模式.observers;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class CurrentConditions implements Observer{

    private float temperature;
    private float pressure;
    private float humdity;

    public void update(float temperature , float pressure , float humdity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humdity = humdity;
        display();
    }

    public void display(){
        System.out.println("todaty temperature" + temperature);
        System.out.println("todaty pressure" + pressure);
        System.out.println("todaty humdity" + humdity);
    }

}
