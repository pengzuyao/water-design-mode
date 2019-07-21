package com.pzy.study.C21备忘录模式;

import java.util.HashMap;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class MementCaretaker {

    private HashMap<String ,MementoIF> mementoMap;

    public MementCaretaker(){
        mementoMap = new HashMap<String ,MementoIF>();
    }

    public MementoIF retrieveMemento(String name){
        return mementoMap.get(name);
    }

    /**
     * 保存备忘录
     */
    public void saveMemento(String name , MementoIF mementoIF){
        this.mementoMap.put(name , mementoIF);
    }
}
