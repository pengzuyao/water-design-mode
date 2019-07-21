package com.pzy.study.C05工厂模式.absfactory;


import com.pzy.study.C05工厂模式.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
