package com.pzy.study.C03装饰者模式.coffeebar.coffee;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class Espresso extends Coffee {
    public Espresso() {
        super.setDescription("Espresso");
        super.setPrice(3.0f);
    }
}
