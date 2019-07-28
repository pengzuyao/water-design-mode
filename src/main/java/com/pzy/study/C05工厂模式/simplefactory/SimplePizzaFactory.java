package com.pzy.study.C05工厂模式.simplefactory;


import com.pzy.study.C05工厂模式.pizza.CheesePizza;
import com.pzy.study.C05工厂模式.pizza.GreekPizza;
import com.pzy.study.C05工厂模式.pizza.PepperPizza;
import com.pzy.study.C05工厂模式.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
