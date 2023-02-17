package com.xworkz.polymorphism.dataCodes.inheritance.method.overriding;

public class Soil {
	private String moisture;
	{
		System.out.println("Soil class started");
	}

	public void setMoisture(String moisture) {
		System.out.println("Moisture of the soil " + moisture);
	}

	public float getHeight() {
		return 9.5f;
	}
}
