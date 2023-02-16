package com.xworkz.polymorphism.dataCodes.inheritance.method;

public class OnionMasalaRagiRoti extends OnionRagiRoti {
	private int thickness;
	{
		System.out.println("Onion Masala Ragi Roti class Started");
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
		System.out.println("Thickness of the Roti " + thickness + " cm");
	}

}
