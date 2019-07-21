package com.pzy.study.C23访问者模式;

/**
 * Destription: 雇员年终奖问题
 * Author: pengzuyao
 * Time: 2019-07-13
 */
public class VisitorTest {

    public static void main(String[] args) {

        Employees employees = new Employees();
        employees.attach(new Employee("Tom" ,4500 , 8 ,1));
        employees.attach(new Employee("Jin" ,6500 , 10 ,2));
        employees.attach(new Employee("Jack" ,9600 , 12 ,3));

        employees.accept(new CompensationVisitor());
    }


    /**
     * 访问者模式：对于一组对象，在不改变数据结构的前提下，增加作用于这些结构元素的新功能。
     * 注意事项：
     * 1、系统有比较稳定的数据结构
     * 2、与迭代器的关系
     * 使用场合：
     * 如果一个系统有比较稳定的数据结构，又有经常变化的功能需求，那么访问者模式就是比较合适的
     */
}
