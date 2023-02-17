package com.xworkz.polymorphism.dataCodes.inheritance.method.overriding;

public class WallClock extends Clock {
	{
		System.out.println("Wall Clock class started");
	}

	@Override
	public void setTicking() {
		System.out.println("Clock is not ticking");
	}
}
