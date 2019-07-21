package com.pzy.study.C07适配器模式.adapter;

import com.pzy.study.C07适配器模式.duck.Duck;
import com.pzy.study.C07适配器模式.turkey.Turkey;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey)
	{
		this.turkey=turkey;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			turkey.fly();
		}
	}

}
