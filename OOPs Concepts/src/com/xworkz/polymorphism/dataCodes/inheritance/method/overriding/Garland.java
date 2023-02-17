package com.xworkz.polymorphism.dataCodes.inheritance.method.overriding;

public class Garland {
	private boolean fresh;
	private String  flowers;
	
	{
		System.out.println("Garland class started");
	}
	public boolean isFresh() {
		return true;
	}
	public String getFlowers() {
		return "Beautiful";
	}
	
}
