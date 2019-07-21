package com.pzy.study.C01策略模式.ducks;


import com.pzy.study.C01策略模式.behaviors.BadFlyBehavior;
import com.pzy.study.C01策略模式.behaviors.GeGeQuackBehavior;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("RedHeadDuck");
    }
}
