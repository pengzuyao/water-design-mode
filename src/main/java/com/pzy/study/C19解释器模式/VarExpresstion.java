package com.pzy.study.C19解释器模式;

import java.util.HashMap;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class VarExpresstion extends AbstractExpresstion {

    private String key;

    public VarExpresstion(String key){
        this.key = key;
    }

    @Override
    public Float interpreter(HashMap<String, Float> var) {
        return var.get(this.key);
    }
}
