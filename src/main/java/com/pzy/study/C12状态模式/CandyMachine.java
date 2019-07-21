package com.pzy.study.C12状态模式;


/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-21
 */
public class CandyMachine {

    public State soldOutState;
    public State onReadyState;
    public State hasCoin;
    public State soldState;
    public State winnerState;
    private State state;
    private int count = 0;

    public CandyMachine(int count){
        this.count =count;
        soldOutState = new SoldOutState(this);
        onReadyState = new OnReadyState(this);
        hasCoin = new HasCoin(this);
        soldState = new SoldSate(this);
        winnerState = new WinnerState(this);
        if (count > 0){
            state = onReadyState;
        }else {
            state = soldOutState;
        }
    }

    public void setState(State state){
        this.state = state;
    }

    public void insertCoin(){
        state.insertCoin();
    }

    public void returnCoin(){
        state.returnCoin();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void printstate(){
        state.printstate();
    }

    public void releaseCandy(){
        if (count > 0){
            --count;
            System.out.println("a candy rolling out");
        }
    }

    public int getCount(){
        return count;
    }


}
