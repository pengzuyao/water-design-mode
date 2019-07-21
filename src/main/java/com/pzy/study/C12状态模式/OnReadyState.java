package com.pzy.study.C12状态模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-21
 */
public class OnReadyState implements State {

    private CandyMachine candyMachine;

    public OnReadyState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("you have inserted a coin ,next ,please turn crank!");
        candyMachine.setState(candyMachine.hasCoin);
    }

    @Override
    public void returnCoin() {
        System.out.println("you haven't inserted a coin yet!");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned ,but you haven't inserted a coin!");
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {
        System.out.println("**** onReadyState ****");
    }
}
