package com.pzy.study.C15桥接模式.bridge;

import com.pzy.study.C15桥接模式.controls.Control;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class SimpleControl extends AbstractControl {

    private int ch = 0;
    private boolean ison = false;

    public SimpleControl(Control control) {
        super(control);
    }

    @Override
    public void onOff() {
        if (ison){
            ison =false;
            control.off();
        }else {
            ison =true;
            control.on();
        }
    }

    @Override
    public void nextChannel() {
        ch++;
        control.setChannel(ch);
    }

    @Override
    public void preChannel() {
        ch--;
        if (ch < 200){
            ch = 200;
        }
        control.setChannel(ch);
    }
}
