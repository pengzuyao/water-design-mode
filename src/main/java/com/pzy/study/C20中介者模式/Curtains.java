package com.pzy.study.C20中介者模式;

/**
 * Destription: 窗帘
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name ,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange ,this.name);
    }

    public void upCurtains(){
        System.out.println("I am holding up Curtains!");
    }
}
