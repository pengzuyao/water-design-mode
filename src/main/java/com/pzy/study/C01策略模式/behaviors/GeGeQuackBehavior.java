package com.pzy.study.C01策略模式.behaviors;

/**
 * Destription: 叫声行为
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class GeGeQuackBehavior implements QuackBehavior {

    public void quack() {
        System.out.println("Ge Ge Quack");
    }
}
