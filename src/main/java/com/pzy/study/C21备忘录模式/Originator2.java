package com.pzy.study.C21备忘录模式;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class Originator2 {

    private ArrayList<String> state;

    public Originator2(){
        state = new ArrayList<>();
    }

    public MementoIF createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(MementoIF memento){
        state = ((Memento)memento).getState();
    }

    public void showState(){
        System.out.println("now state:" + state.toString());
    }

    public void testState1(){
        state.add("blood:500");
        state.add("progress:gate1 end");
        state.add("enemy:5");
    }

    public void testState2(){
        state.clear();
        state.add("blood:450");
        state.add("progress:gate3 start");
        state.add("enemy:3");
    }

    private class Memento implements MementoIF{

        private ArrayList<String> state;

        private Memento(ArrayList state){
            this.state = new ArrayList<>(state);
        }

        private ArrayList<String> getState(){
            return state;
        }

        private void setState(ArrayList state){
            this.state =state;
        }
    }
}
