package com.pzy.study.C16生成器模式;


import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-20
 */
@Data
public class Vacation {

    private ArrayList<VacationDay> vacationDays;
    private Date date;
    private int day = 0;
    private VacationDay vacationDay;

    public Vacation(String std){
        vacationDays = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdf.parse(std);
            vacationDay = new VacationDay(date);
            vacationDays.add(vacationDay);
            day++;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setDate(String std){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sdf.parse(std);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void addDay(){
        vacationDay = new VacationDay(nextDate(day));
        vacationDays.add(vacationDay);
        day++;
    }

    public boolean setVacationDay(int i){
        if ((i > 0) && (i < vacationDays.size())){
            vacationDay = vacationDays.get(i);
        }
        vacationDay = null;
        return false;
    }

    private Date nextDate(int n){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE , n);
        return calendar.getTime();
    }

}
