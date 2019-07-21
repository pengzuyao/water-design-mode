package com.pzy.study.C20中介者模式;

/**
 * Destription:闹铃
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name ,this);
    }

    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange ,this.name);
    }
}
