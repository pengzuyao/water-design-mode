package com.pzy.study.C18蝇量模式;

import java.util.HashMap;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class PlantFactory {

    private HashMap<Integer , Plant> plantMap = new HashMap<>();

    public Plant getPlant(int type){
        if (!plantMap.containsKey(type)){
           switch (type){
               case 0:
                   plantMap.put(0 ,new Tree());
                   break;
               case 1:
                   plantMap.put(1 ,new Grass());
                   break;
           }
        }
        return plantMap.get(type);
    }
}
