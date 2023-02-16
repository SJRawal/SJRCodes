package com.xworkz.polymorphism.dataCodes.inheritance.method;

public class ButterRoti extends JowerRoti {
	private float length;
	{
		System.out.println("Butter Roti class started");
	}

	public float getLength(float length) {
		this.length = length;
		System.out.println("Length of the Roti " + length);
		return 0;
	}

}
