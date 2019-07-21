package com.pzy.study.C19解释器模式;

import java.util.HashMap;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class AddExpresstion extends SymbolExpresstion {

    public AddExpresstion(AbstractExpresstion left, AbstractExpresstion right) {
        super(left, right);
    }

    @Override
    public Float interpreter(HashMap<String, Float> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
