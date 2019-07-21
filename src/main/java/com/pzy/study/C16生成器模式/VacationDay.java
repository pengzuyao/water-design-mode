package com.pzy.study.C16生成器模式;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
@Data
public class VacationDay {

    private Date date;
    private String hotels;
    private ArrayList<String> tickets = null;
    private ArrayList<String> events = null;

    public VacationDay(Date date){
        this.date = date;
        tickets = new ArrayList<>();
        events = new ArrayList<>();
    }

}
