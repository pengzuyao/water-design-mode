package com.pzy.study.C03装饰者模式.coffeebar.decorator;

import com.pzy.study.C03装饰者模式.coffeebar.Drink;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class Decorator extends Drink {

    private Drink Obj;

    public Decorator(Drink Obj){
        this.Obj = Obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + Obj.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"&&" +Obj.getDescription();
    }
}
