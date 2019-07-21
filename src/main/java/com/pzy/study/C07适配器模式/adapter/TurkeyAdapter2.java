package com.pzy.study.C07适配器模式.adapter;

import com.pzy.study.C07适配器模式.duck.Duck;
import com.pzy.study.C07适配器模式.turkey.WildTurkey;

public class TurkeyAdapter2 extends WildTurkey implements Duck {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		super.gobble();
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
		super.fly();
		super.fly();
	}
}
