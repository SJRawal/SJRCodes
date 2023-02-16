package com.xworkz.polymorphism.dataCodes.inheritance.method;

public class Device {
	private String type;
	int old;

	{
		System.out.println("Device constructor with no parameter");
	}

	public void setType(String type) {
		this.type = type;
		System.out.println("Brand is printing " + type);
	}

	public void setOld(int old) {
		this.old = old;
		System.out.println("Series is displaying " + old);
	}

}
