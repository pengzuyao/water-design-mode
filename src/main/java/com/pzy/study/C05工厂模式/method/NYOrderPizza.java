package com.pzy.study.C05工厂模式.method;


import com.pzy.study.C05工厂模式.pizza.NYCheesePizza;
import com.pzy.study.C05工厂模式.pizza.NYPepperPizza;
import com.pzy.study.C05工厂模式.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
