package com.pzy.study.C23访问者模式;

/**
 * Destription:薪资补偿访问者
 * Author: pengzuyao
 * Time: 2019-07-14
 */
public class CompensationVisitor implements Visitor {

    @Override
    public void visit(Element element) {
        Employee employee = (Employee) element;
        System.out.println(employee.getName() + "'s Compensation is " + (employee.getDegree() * employee.getVacationDays() * 100));
    }
}
