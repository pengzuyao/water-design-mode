package com.pzy.study.C09模板模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-21
 */
public abstract class HotDrink {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addConfiments();
    }

    public final void boilWater(){
        System.out.println("boiling water");
    }

    public abstract void brew();

    public final void pourInCup(){
        System.out.println("pouring into cup");
    }

    public abstract void addConfiments();
}
