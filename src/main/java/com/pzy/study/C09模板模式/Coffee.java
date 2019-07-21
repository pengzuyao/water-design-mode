package com.pzy.study.C09模板模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-21
 */
public class Coffee extends HotDrink {

    @Override
    public void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    public void addConfiments() {
        System.out.println("adding sugar and milk");
    }
}
