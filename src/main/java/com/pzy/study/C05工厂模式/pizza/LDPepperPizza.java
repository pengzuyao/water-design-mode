package com.pzy.study.C05工厂模式.pizza;

public class LDPepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("LDPepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
