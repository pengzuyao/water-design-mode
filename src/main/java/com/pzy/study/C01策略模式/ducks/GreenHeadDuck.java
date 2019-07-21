package com.pzy.study.C01策略模式.ducks;


import com.pzy.study.C01策略模式.behaviors.GaGaQuackBehavior;
import com.pzy.study.C01策略模式.behaviors.GoodFlyBehavior;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class GreenHeadDuck extends Duck {

    public GreenHeadDuck(){
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("GreenHeadDuck");
    }
}
