package com.pzy.study.C01策略模式.behaviors;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class NoFlyBehavior implements FlyBehavior {


    public void fly() {
        System.out.println("No fly");
    }
}
