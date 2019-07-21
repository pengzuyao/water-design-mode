package com.pzy.study.C15桥接模式.controls;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public interface Control {

    public void on();
    public void off();
    public void setChannel(int ch);
    public void setVolume(int vol);

}
