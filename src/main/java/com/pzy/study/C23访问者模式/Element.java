package com.pzy.study.C23访问者模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public abstract class Element {

    public abstract void accept(Visitor visitor);
}
