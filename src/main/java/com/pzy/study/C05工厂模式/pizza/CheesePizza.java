package com.pzy.study.C05工厂模式.pizza;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("CheesePizza");
		
		System.out.println(name+" preparing;");
	}

}
