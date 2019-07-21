package com.pzy.study.C20中介者模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public abstract class Colleague {

    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator(){
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);
}
