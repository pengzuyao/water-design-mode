package com.pzy.study.C05工厂模式.pizza;

public class NYPepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("NYPepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
