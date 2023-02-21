package com.xworkz.polymorphism.boot.objectboot;

import com.xworkz.polymorphism.dataCodes.inheritance.objectmanip.Coconut;

public class CoconutData {

	public static void main(String[] args) {
		Coconut coconut = new Coconut();
		coconut.setPrice(50);
		coconut.setLocation("Mandya");
		coconut.setSize("Medium");
		coconut.isSweet(true);
		System.out.println(coconut);
		System.out.println(coconut.hashCode() + " Original HashCode " + System.identityHashCode(coconut));
		Coconut coconut2 = new Coconut();
		coconut2.setPrice(30);
		coconut2.setLocation("Bengaluru");
		coconut2.setSize("Big");
		coconut2.isSweet(false);
		System.out.println(coconut2);
		System.out.println(coconut2.hashCode() + " Original HashCode " + System.identityHashCode(coconut2));

	}

}
