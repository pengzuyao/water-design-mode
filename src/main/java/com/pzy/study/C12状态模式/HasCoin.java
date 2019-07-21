package com.pzy.study.C12状态模式;

import java.util.Random;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-21
 */
public class HasCoin implements State {

    private CandyMachine candyMachine;

    public HasCoin(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("you can't insert another coin!");
    }

    @Override
    public void returnCoin() {
        System.out.println("coin return!");
        candyMachine.setState(candyMachine.onReadyState);
    }

    @Override
    public void turnCrank() {
        System.out.println("crank turn...!");
        Random random = new Random();
        int winner = random.nextInt(10);
        if (winner == 0){
            candyMachine.setState(candyMachine.winnerState);
        }else {
            candyMachine.setState(candyMachine.soldState);
        }
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {
        System.out.println("***HasCoin***");
    }
}
