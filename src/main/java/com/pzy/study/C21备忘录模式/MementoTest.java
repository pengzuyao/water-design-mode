package com.pzy.study.C21备忘录模式;

/**
 * Destription:游戏进度保存
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class MementoTest {

    public static void main(String[] args) {
        //存档函数
        MementCaretaker mementCaretaker = new MementCaretaker();
        //发起者1
        Originator1 originator1 = new Originator1();
        //发起者2
        Originator2 originator2 = new Originator2();
        System.out.println("*****Originator1*****");
        originator1.testState1();
        mementCaretaker.saveMemento("Originator1" , originator1.createMemento());
        originator1.showState();
        originator1.testState2();
        originator1.showState();
        originator1.restoreMemento(mementCaretaker.retrieveMemento("Originator1"));
        originator1.showState();

        System.out.println("*****Originator2*****");
        originator2.testState1();
        mementCaretaker.saveMemento("Originator2" ,originator2.createMemento());
        originator2.showState();
        originator2.testState2();
        originator2.showState();
        originator2.restoreMemento(mementCaretaker.retrieveMemento("Originator2"));
        originator2.showState();


    }


    /**
     * 备忘录模式：在不破坏封装的前提下，存储关键对象的重要状态，从而可以在将来把对象还原到存储的那个状态
     */
}
