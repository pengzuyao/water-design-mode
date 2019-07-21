package com.pzy.study.C16生成器模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class BuilderSelf {

    private Vacation vacation;

    public BuilderSelf(String std){
        vacation = new Vacation(std);
    }

    public BuilderSelf addDay(){
        vacation.addDay();
        return this;
    }

    public Vacation build(){
        return this.vacation;
    }
}
