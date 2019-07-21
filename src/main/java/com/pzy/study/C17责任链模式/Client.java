package com.pzy.study.C17责任链模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class Client {

    public PurchaseRequest sendRequest(int type ,int number , int price){
        return new PurchaseRequest(type ,number ,price);
    }
}
