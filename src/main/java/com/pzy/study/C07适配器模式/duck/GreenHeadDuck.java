package com.pzy.study.C07适配器模式.duck;

public class GreenHeadDuck implements Duck {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println(" Ga Ga");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am flying a long distance");
	}

}
