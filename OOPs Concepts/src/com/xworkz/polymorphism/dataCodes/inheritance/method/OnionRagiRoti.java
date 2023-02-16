package com.xworkz.polymorphism.dataCodes.inheritance.method;

public class OnionRagiRoti extends RagiRoti {
	private float weight;
	{
		System.out.println("Onion Ragi Roti class started");
	}

	public void setWeight(float weight) {
		this.weight = weight;
		System.out.println("Weight of the Roti " + weight+" gm");
	}

}
