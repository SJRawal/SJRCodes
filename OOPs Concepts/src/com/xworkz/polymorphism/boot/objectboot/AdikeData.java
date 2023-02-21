package com.xworkz.polymorphism.boot.objectboot;

import com.xworkz.polymorphism.dataCodes.inheritance.objectmanip.Adike;

public class AdikeData {

	public static void main(String[] args) {
		Adike adike = new Adike();
		adike.setPrice(600);
		adike.setQualityGood(true);
		adike.setQuantity(1000);
		adike.setVariety("Manglore");
		System.out.println(adike);
		System.out.println(adike.hashCode() + " Original hashCode: " + System.identityHashCode(adike));
		Adike adike2 = new Adike();
		adike2.setPrice(750);
		adike2.setQualityGood(false);
		adike2.setQuantity(500);
		adike2.setVariety("Kodagu");
		System.out.println(adike2);
		System.out.println(adike.hashCode() + " Original hashCode: " + System.identityHashCode(adike));
		System.out.println("Before manipulation " + adike.equals(adike2));
		adike = adike2;
		System.out.println("After Manipulation " + adike.equals(adike2));
	}

}
