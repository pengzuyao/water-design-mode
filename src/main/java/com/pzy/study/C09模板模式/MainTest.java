package com.pzy.study.C09模板模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-21
 */
public class MainTest {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
