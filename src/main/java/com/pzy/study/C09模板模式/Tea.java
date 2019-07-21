package com.pzy.study.C09模板模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-21
 */
public class Tea extends HotDrink {

    @Override
    public void brew() {
        System.out.println("brew tea");
    }

    @Override
    public void addConfiments() {
        System.out.println("add lemon");
    }
}
