package com.pzy.study.C17责任链模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public abstract class Approver {

    Approver successor;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public abstract void ProcessRequest(PurchaseRequest request);

    public void setSuccessor(Approver successor){
        this.successor = successor;
    }
}
