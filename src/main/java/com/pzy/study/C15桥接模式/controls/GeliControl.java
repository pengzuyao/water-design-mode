package com.pzy.study.C15桥接模式.controls;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class GeliControl implements Control {

    @Override
    public void on() {
        System.out.println("**** open geli tv ****");
    }

    @Override
    public void off() {
        System.out.println("**** off geli tv ****");
    }

    @Override
    public void setChannel(int ch) {
        System.out.println("**** geli tv channel is "+ ch);
    }

    @Override
    public void setVolume(int vol) {
        System.out.println("**** geli tv volume is " + vol);
    }
}
