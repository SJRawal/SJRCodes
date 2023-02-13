package com.xworkz.polymorphism.dataCodes.inheritance;

public class PalaceCity {
	private String state;
	private int population;
	public PalaceCity(String state) {
		System.out.println("\n Const with parameter args "+state);
	}
	public PalaceCity(int population) {
		System.out.println("\n Const with integer oarameter args "+population);
	}

}
