package com.xworkz.polymorphism.dataCodes.inheritance.method.overriding;

public class RoseGarland extends Garland{
	{
		System.out.println("Rose Garland class started");
	}
	
	public boolean isFresh() {
		return false;
	}
	public String getFlowers() {
		return "Not Beautiful";
	}
}
