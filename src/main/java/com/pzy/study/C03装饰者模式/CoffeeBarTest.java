package com.pzy.study.C03装饰者模式;

import com.pzy.study.C03装饰者模式.coffeebar.Drink;
import com.pzy.study.C03装饰者模式.coffeebar.coffee.Decaf;
import com.pzy.study.C03装饰者模式.coffeebar.coffee.LongBlock;
import com.pzy.study.C03装饰者模式.coffeebar.decorator.Chocolate;
import com.pzy.study.C03装饰者模式.coffeebar.decorator.Milk;
import com.pzy.study.C03装饰者模式.coffeebar.decorator.Soy;

/**
 * Destription: 咖啡馆卖咖啡问题
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class CoffeeBarTest {

    public static void main(String[] args) {
        Drink order1 = new Decaf();
        System.out.println("order1 desc:" + order1.getDescription());
        System.out.println("order1 price:" + order1.cost());

        Drink order2 = new LongBlock();
        order2 = new Milk(order2);
        order2 = new Chocolate(order2);
        order2 = new Soy(order2);
        System.out.println("order2 desc:" + order2.getDescription());
        System.out.println("order2 price:" + order2.cost());
    }
}
