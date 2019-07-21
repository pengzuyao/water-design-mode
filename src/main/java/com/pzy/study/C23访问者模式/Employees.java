package com.pzy.study.C23访问者模式;

import java.util.HashMap;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class Employees {

    private HashMap<String , Employee> employees;

    public Employees(){
        employees = new HashMap<>();
    }

    public Employee getEmployee(String name){
        return employees.get(name);
    }

    public void attach(Employee employee){
        employees.put(employee.getName(),employee);
    }

    public void detach(Employee employee){
        employees.remove(employee);
    }

    public void accept(Visitor visitor){
        for (Employee employee : employees.values()) {
            employee.accept(visitor);
        }
    }
}
