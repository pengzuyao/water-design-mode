package com.pzy.study.C09模板模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-21
 */
public class TeaWithHook extends HotDrinkTemplate {

    @Override
    public void brew() {
        System.out.println("brewing tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding lemon");
    }

    @Override
    public boolean wantCondimentsHook() {
        return super.wantCondimentsHook();
    }
}
