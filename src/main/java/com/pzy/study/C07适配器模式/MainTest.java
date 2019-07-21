package com.pzy.study.C07适配器模式;


import com.pzy.study.C07适配器模式.adapter.TurkeyAdapter2;
import com.pzy.study.C07适配器模式.duck.Duck;
import com.pzy.study.C07适配器模式.duck.GreenHeadDuck;
import com.pzy.study.C07适配器模式.turkey.WildTurkey;

public class MainTest {
	public static void main(String[] args) {
		GreenHeadDuck duck=new GreenHeadDuck();
		
		WildTurkey turkey=new WildTurkey();
		
		Duck duck2turkeyAdapter=new TurkeyAdapter2();
		turkey.gobble();
		turkey.fly();
		duck.quack();
		duck.fly();
		duck2turkeyAdapter.quack();
		duck2turkeyAdapter.fly();
		
	
	}
}
