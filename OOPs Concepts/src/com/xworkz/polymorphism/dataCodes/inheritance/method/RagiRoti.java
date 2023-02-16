package com.xworkz.polymorphism.dataCodes.inheritance.method;

public class RagiRoti extends Roti {
	private int calories;
	{
		System.out.println("Ragi Roti class started");
	}

	public void setCalories(int calories) {
		this.calories = calories;
		System.out.println("Calories inside the roti " + calories);
	}

}
