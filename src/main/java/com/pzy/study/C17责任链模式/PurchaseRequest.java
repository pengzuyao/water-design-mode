package com.pzy.study.C17责任链模式;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */

@Data
public class PurchaseRequest {

    private int Type = 0;
    private int number = 0;
    private int price = 0;
    private int id = 0;

    public PurchaseRequest(int type, int number, int price) {
        Type = type;
        this.number = number;
        this.price = price;
    }

    public float getSum(){
        return number * price;
    }

    public int getId() {
        return (int)(Math.random()*1000);
    }
}
