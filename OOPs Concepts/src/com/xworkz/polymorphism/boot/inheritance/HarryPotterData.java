package com.xworkz.polymorphism.boot.inheritance;
import com.xworkz.polymorphism.dataCodes.inheritance.method.HarryPotter;
import com.xworkz.polymorphism.dataCodes.inheritance.method.HarryPotterBook;
public class HarryPotterData {
	public static void main(String[] args) {
		
		HarryPotterBook nameHP = new HarryPotterBook();
		
		nameHP.setTotalBooks(7);
		nameHP.setYop(1997);
		nameHP.setHeroine("Ginny Weasley");
		System.out.println(nameHP+" "+nameHP.getHeroine());
		
		HarryPotter newHP1 = new HarryPotter(8, "Harry Potter", "Voldermort", true);
		System.out.println(newHP1);
	}

}
