package com.pzy.study.C15桥接模式.controls;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class XiaomiControl implements Control {

    @Override
    public void on() {
        System.out.println("**** open xiaomi tv ****");
    }

    @Override
    public void off() {
        System.out.println("**** off xiaomi tv ****");
    }

    @Override
    public void setChannel(int ch) {
        System.out.println("**** xiao tv channel is "+ ch);
    }

    @Override
    public void setVolume(int vol) {
        System.out.println("**** xiaomi tv volume is " + vol);
    }
}
