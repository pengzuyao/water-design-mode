package com.pzy.study.C20中介者模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class MediatorTest {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator ,"Alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator ,"CoffeeMachine");
        Curtains curtains = new Curtains(mediator ,"Curtains");
        TV tv = new TV(mediator ,"TV");
        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }


    /**
     * 中介者模式：用一个中介对象来封装一系列的对象交互
     * 注意事项：
     *  1、中介者模式和外观模式
     *  2、中介者模式和观察者模式
     *  适用场景：
     *  一组对象之间的通信方式比较复杂，导致相互依赖，结构混乱
     *  一个对象引用很多其他对象并直接与这些对象通信，导致难以复用该对象
     */
}
