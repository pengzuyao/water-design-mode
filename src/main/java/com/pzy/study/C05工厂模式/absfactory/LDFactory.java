package com.pzy.study.C05工厂模式.absfactory;


import com.pzy.study.C05工厂模式.pizza.LDCheesePizza;
import com.pzy.study.C05工厂模式.pizza.LDPepperPizza;
import com.pzy.study.C05工厂模式.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
