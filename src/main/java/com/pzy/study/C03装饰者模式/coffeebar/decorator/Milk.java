package com.pzy.study.C03装饰者模式.coffeebar.decorator;

import com.pzy.study.C03装饰者模式.coffeebar.Drink;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class Milk extends Decorator {

    public Milk(Drink Obj) {
        super(Obj);
        super.setDescription("Milk");
        super.setPrice(4.5f);
    }
}
