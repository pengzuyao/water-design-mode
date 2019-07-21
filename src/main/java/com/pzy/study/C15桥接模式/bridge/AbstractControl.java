package com.pzy.study.C15桥接模式.bridge;

import com.pzy.study.C15桥接模式.controls.Control;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public abstract class AbstractControl {

    Control control ;

    public AbstractControl(Control control){
        this.control = control;
    }

    public abstract void onOff();
    public abstract void nextChannel();
    public abstract void preChannel();
}
