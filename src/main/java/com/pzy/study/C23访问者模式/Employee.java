package com.pzy.study.C23访问者模式;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class Employee extends Element {

    private String name;
    private float income;
    private int vacationDays;
    private int degree;

    public Employee(String name, float income, int vacationDays, int degree) {
        this.name = name;
        this.income = income;
        this.vacationDays = vacationDays;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    /**
     * 双重指派：雇员接收访问者，并将自己反馈给访问者
     * @param visitor
     */
    public void accept(Visitor visitor) {
            visitor.visit(this);
    }
}
