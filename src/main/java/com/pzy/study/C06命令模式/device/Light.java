package com.pzy.study.C06命令模式.device;

public class Light {

	String loc = "";

	public Light(String loc) {
		this.loc = loc;
	}

	public void On() {

		System.out.println(loc + " On");
	}

	public void Off() {

		System.out.println(loc + " Off");
	}

}
