package com.pzy.study.C19解释器模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public abstract class SymbolExpresstion extends AbstractExpresstion {

    protected AbstractExpresstion left;
    protected AbstractExpresstion right;

    public SymbolExpresstion(AbstractExpresstion left , AbstractExpresstion right){
        this.left = left;
        this.right = right;
    }
}
