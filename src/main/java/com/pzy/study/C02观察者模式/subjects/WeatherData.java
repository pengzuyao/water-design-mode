package com.pzy.study.C02观察者模式.subjects;

import com.pzy.study.C02观察者模式.observers.Observer;

import java.util.ArrayList;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humdity;
    private ArrayList<Observer> observers;


    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }


    public float getHumdity() {
        return humdity;
    }

    public void setData(float temperature , float pressure , float humdity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humdity = humdity;
        dataChange();
    }

    private void dataChange() {
        notifyObserver();
    }


    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(getTemperature() ,getPressure() ,getHumdity());
        }
    }
}
