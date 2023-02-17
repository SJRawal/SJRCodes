package com.xworkz.polymorphism.dataCodes.inheritance.method.overriding;

public class Tubelight {
	protected boolean on;
	protected boolean good;

	{
		System.out.println("Clock class started");
	}

	public void setOn(boolean on) {
		this.on = on;
		System.out.println(false);
	}

	public void setGood(boolean good) {
		this.good = good;
		System.out.println(true);
	}

}
