package com.xworkz.polymorphism.dataCodes.inheritance.method;

public class JowerRoti extends Roti {

	private float price;
	{
		System.out.println("Jower Roti class started ");
	}

	public int getPrice(float price) {
		this.price = price;
		System.out.println("Price of the roti is " + price);
		return 0;
	}

}
