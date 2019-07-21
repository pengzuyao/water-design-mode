package com.pzy.study.C01策略模式;

import com.pzy.study.C01策略模式.behaviors.NoFlyBehavior;
import com.pzy.study.C01策略模式.ducks.Duck;
import com.pzy.study.C01策略模式.ducks.GreenHeadDuck;
import com.pzy.study.C01策略模式.ducks.RedHeadDuck;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class DuckTest {

    public static void main(String[] args) {
        Duck green = new GreenHeadDuck();
        Duck red = new RedHeadDuck();

        green.display();
        green.swim();
        green.fly();
        green.quack();

        red.display();
        red.swim();
        red.fly();
        red.quack();

        green.setFlyBehavior(new NoFlyBehavior());
        green.fly();
    }
}
