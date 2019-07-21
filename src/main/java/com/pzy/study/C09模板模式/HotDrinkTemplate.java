package com.pzy.study.C09模板模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-21
 */
public abstract class HotDrinkTemplate {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (wantCondimentsHook()){
            addCondiments();
        }else {
            System.out.println("No Condiments");
        }
    }



    private final void boilWater(){
        System.out.println("boiling water");
    }

    public abstract void brew();

    private final void pourInCup(){
        System.out.println("pouring into cup");
    }

    public boolean wantCondimentsHook(){
        return true;
    }

    public abstract void addCondiments();
}
