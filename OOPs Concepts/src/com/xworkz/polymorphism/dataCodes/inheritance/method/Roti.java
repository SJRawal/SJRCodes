package com.xworkz.polymorphism.dataCodes.inheritance.method;

public class Roti {
	private String shape;
	{
		System.out.println("Roti Class Started ");
	}

	public void setShape(String shape) {
		this.shape = shape;
		System.out.println("Shape of the Roti " + shape);
	}

}
