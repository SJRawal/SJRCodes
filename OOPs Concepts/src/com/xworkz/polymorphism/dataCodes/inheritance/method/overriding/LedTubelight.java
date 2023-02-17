package com.xworkz.polymorphism.dataCodes.inheritance.method.overriding;

public class LedTubelight extends Tubelight {
	{
		System.out.println("Clock class started");
	}

	@Override
	public void setOn(boolean on) {
		this.on = on;
		System.out.println(true);
	}

	@Override
	public void setGood(boolean good) {
		this.good = good;
		System.out.println(false);
	}
}
