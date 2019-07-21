package com.pzy.study.C12状态模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-21
 */
public class MainTest {

    public static void main(String[] args) {
        CandyMachine mCandyMachine = new CandyMachine(6);

        mCandyMachine.printstate();

        mCandyMachine.insertCoin();
        mCandyMachine.printstate();

        mCandyMachine.turnCrank();

        mCandyMachine.printstate();

        mCandyMachine.insertCoin();
        mCandyMachine.printstate();

        mCandyMachine.turnCrank();

        mCandyMachine.printstate();
    }
}
