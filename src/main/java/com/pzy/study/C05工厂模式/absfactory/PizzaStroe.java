package com.pzy.study.C05工厂模式.absfactory;



public class PizzaStroe {
	public static void main(String[] args) {
		
		OrderPizza mOrderPizza;
		mOrderPizza=new	OrderPizza(new LDFactory());
		
	}

	

}
