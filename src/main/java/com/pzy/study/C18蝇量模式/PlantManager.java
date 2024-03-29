package com.pzy.study.C18蝇量模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
public class PlantManager {

    private  int length = 10000000;
    private int[] xArray = new int[length] ,yArray = new int[length],
        ageArray = new int[length] , typeArray = new int[length];
    private PlantFactory plantFactory;
    public PlantManager(){
        plantFactory = new PlantFactory();
        for (int i = 0; i < length; i++) {
            xArray[i] = (int)(Math.random() * length);
            yArray[i] = (int)(Math.random() * length);
            ageArray[i] = (int)(Math.random() * length)% 5;
            typeArray[i] = (int)(Math.random() * length)% 2;
        }
    }

    public void displayTrees(){
        for (int i = 0; i < length; i++) {
            plantFactory.getPlant(typeArray[i]).display(xArray[i] ,yArray[i] ,ageArray[i]);
        }
    }
}
