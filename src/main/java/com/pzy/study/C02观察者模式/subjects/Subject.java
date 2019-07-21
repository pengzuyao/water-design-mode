package com.pzy.study.C02观察者模式.subjects;

import com.pzy.study.C02观察者模式.observers.Observer;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
