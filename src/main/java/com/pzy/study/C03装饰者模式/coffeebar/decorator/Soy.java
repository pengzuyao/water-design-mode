package com.pzy.study.C03装饰者模式.coffeebar.decorator;

import com.pzy.study.C03装饰者模式.coffeebar.Drink;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class Soy extends Decorator {

    public Soy(Drink Obj) {
        super(Obj);
        super.setDescription("Soy");
        super.setPrice(1.5f);
    }
}
