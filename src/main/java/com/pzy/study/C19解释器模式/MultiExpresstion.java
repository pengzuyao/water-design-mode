package com.pzy.study.C19解释器模式;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class MultiExpresstion extends SymbolExpresstion {

    public MultiExpresstion(AbstractExpresstion left, AbstractExpresstion right) {
        super(left, right);
    }

    @Override
    public Float interpreter(HashMap<String, Float> var) {
        return super.left.interpreter(var) * super.right.interpreter(var);
    }


}
