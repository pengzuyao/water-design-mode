package com.pzy.study.C15桥接模式.controls;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class HuaweiControl implements Control {

    @Override
    public void on() {
        System.out.println("**** open huawei tv ****");
    }

    @Override
    public void off() {
        System.out.println("**** off huawei tv ****");
    }

    @Override
    public void setChannel(int ch) {
        System.out.println("**** huawei tv channel is "+ ch);
    }

    @Override
    public void setVolume(int vol) {
        System.out.println("**** huawei tv volume is " + vol);
    }
}
