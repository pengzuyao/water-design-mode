package com.pzy.study.C05工厂模式.pizza;

public class ChinesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("ChinesePizza");
		
		System.out.println(name+" preparing;");
	}

}
