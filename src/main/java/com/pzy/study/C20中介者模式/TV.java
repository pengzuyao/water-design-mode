package com.pzy.study.C20中介者模式;

/**
 * Destription: 电视
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name ,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange , this.name);
    }

    public void startTv(){
        System.out.println("it's time to startTv！");
    }

    public void stopTv(){
        System.out.println("it's time to stopTv!");
    }
}
