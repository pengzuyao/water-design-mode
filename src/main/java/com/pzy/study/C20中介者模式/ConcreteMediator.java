package com.pzy.study.C20中介者模式;

import java.util.HashMap;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class ConcreteMediator implements Mediator {

    private HashMap<String , Colleague> colleagueMap;
    private HashMap<String , String> interMap;

    public ConcreteMediator(){
        colleagueMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }


    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName , colleague);
        if (colleague instanceof Alarm){
            interMap.put("Alarm" , colleagueName);
        }else if (colleague instanceof CoffeeMachine){
            interMap.put("CoffeeMachine" , colleagueName);
        }else if (colleague instanceof TV){
            interMap.put("TV" , colleagueName);
        }else if (colleague instanceof Curtains){
            interMap.put("Curtains" , colleagueName);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm){
            if (stateChange ==0){
                ((CoffeeMachine)colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                ((TV)colleagueMap.get(interMap.get("TV"))).startTv();
            }else {
                ((TV)colleagueMap.get(interMap.get("TV"))).stopTv();
            }
        }else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine){
            ((Curtains)colleagueMap.get(interMap.get("Curtains"))).upCurtains();
        }else if (colleagueMap.get(colleagueName) instanceof TV){

        }else if (colleagueMap.get(colleagueName) instanceof Curtains){

        }
    }

    @Override
    public void sendMessage() {

    }
}
