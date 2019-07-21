package com.pzy.study.C12状态模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-21
 */
public class WinnerState implements State {

    private CandyMachine candyMachine;

    public WinnerState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("please wait!we are giving you a candy!");
    }

    @Override
    public void returnCoin() {
        System.out.println("you haven't inserted a coin yet!");
    }

    @Override
    public void turnCrank() {
        System.out.println("we are giving you a candy,turning another get nothing,!");
    }

    @Override
    public void dispense() {
        candyMachine.releaseCandy();
        if (candyMachine.getCount() == 0) {
            candyMachine.setState(candyMachine.soldOutState);
        } else {
            System.out.println("you are a winner!you get another candy!");
            candyMachine.releaseCandy();
            if (candyMachine.getCount() > 0) {
                candyMachine.setState(candyMachine.onReadyState);
            } else {
                System.out.println("Oo,out of candies");
                candyMachine.setState(candyMachine.soldOutState);
            }
        }
    }

    @Override
    public void printstate() {
        System.out.println("***WinnerState***");
    }
}
