package com.xworkz.polymorphism.boot;

public class Person {

	public static void buy(String food,int quantity) {
		System.out.println(food+" is "+quantity+"gms");
		
	}
	public static void buy(String dress, int shoes, String belt) {
		System.out.println("For Dressing we need "+dress+","+shoes+" no shoes and " +belt+ "belt");

		
	}
	public static void buy(String bag, String watch) {
		System.out.println("In "+bag+" 2nd zip "+watch+" watch is there");

	}
}
