package com.pzy.study.C20中介者模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public interface Mediator {

    public abstract void register(String colleagueName , Colleague colleague);
    public abstract void getMessage(int stateChange , String colleagueName);
    public abstract void sendMessage();
}
