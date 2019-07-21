package com.pzy.study.C12状态模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-21
 */
public interface State {

    public void insertCoin();
    public void returnCoin();
    public void turnCrank();
    public void dispense();
    public void printstate();
}
