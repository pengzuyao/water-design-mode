package com.pzy.study.C03装饰者模式.coffeebar;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public abstract class Drink {

    private String description = " ";
    private float price = 0f;

    public abstract float cost();

    public String getDescription() {
        return description + "-" + this.getPrice();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
