package com.xworkz.polymorphism.boot.objectboot;

import com.xworkz.polymorphism.dataCodes.inheritance.objectmanip.Gold;

public class GoldData {
	public static void main(String[] args) {
		Gold gold = new Gold();
	    gold.setKarat("24k");
	    gold.setWeight(50.0);
	    gold.getPrice = 99566.55f;
	    gold.type = "Bullion";
	    System.out.println(gold.toString());
	}
}
