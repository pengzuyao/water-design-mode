package com.pzy.study.C15桥接模式;

import com.pzy.study.C15桥接模式.bridge.SimpleControl;
import com.pzy.study.C15桥接模式.controls.HuaweiControl;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class MainTest {

    public static void main(String[] args) {

        SimpleControl xiaomiControl;
        xiaomiControl = new SimpleControl(new HuaweiControl());
        xiaomiControl.onOff();
        xiaomiControl.nextChannel();
        xiaomiControl.preChannel();
        xiaomiControl.onOff();
    }
}
