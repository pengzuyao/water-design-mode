package com.pzy.study.C03装饰者模式.coffeebar.coffee;

import com.pzy.study.C03装饰者模式.coffeebar.Drink;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class Coffee  extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
