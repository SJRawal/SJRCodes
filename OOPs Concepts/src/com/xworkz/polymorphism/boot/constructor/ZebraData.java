package com.xworkz.polymorphism.boot.constructor;
import com.xworkz.polymorphism.dataCodes.constructor.Zebra;
public class ZebraData {

	public static void main(String[] args) {
		Zebra animal =  new Zebra();

		animal.region="Mountain zebra";
		animal.age=20;
		animal.weight=280;
		
		System.out.println("Colour of Zebra is "+animal.region);
		System.out.println("Average lifespan of Zebra is "+animal.age+" years");
		System.out.println("Average weight of Zebra is "+animal.weight+" Kgs");
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		animal.region="Grévy's zebra";
		animal.age=25;
		animal.weight=350;
		
		System.out.println("Colour of Zebra is "+animal.region);
		System.out.println("Average lifespan of Zebra is "+animal.age+" years");
		System.out.println("Average weight of Zebra is "+animal.weight+" Kgs");

		
	}

}
