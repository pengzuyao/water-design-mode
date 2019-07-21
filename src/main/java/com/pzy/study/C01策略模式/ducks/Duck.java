package com.pzy.study.C01策略模式.ducks;

import com.pzy.study.C01策略模式.behaviors.FlyBehavior;
import com.pzy.study.C01策略模式.behaviors.QuackBehavior;

/**
 * Destription: 鸭子超类
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("i can swim ....");
    }

    public abstract void display();
}
