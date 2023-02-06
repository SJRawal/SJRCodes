package com.xworkz.polymorphism.boot.constructor;
import com.xworkz.polymorphism.dataCodes.constructor.FrenchFry;
public class FrenchFryData {

	public static void main(String[] args) {
		
		System.out.println("Reference Fries");
		
		FrenchFry fries = new FrenchFry("Medium");
		fries.display();
		
		System.out.println("\nReference Fries1\n");
		
		FrenchFry fries1 = new FrenchFry("Large", "Spring");
		fries1.display();
		
		System.out.println("\nReference Fries2\n");
		
		FrenchFry fries2 = new FrenchFry("Large", "Spring","Salty");
		fries2.display();
		
		System.out.println("\nReference Fries3\n");
		
		FrenchFry fries3= new FrenchFry("Large", "Spring","Salty","Very Hot");
		fries3.display();
		
		System.out.println("\nReference Fries4\n");
		
		FrenchFry fries4 = new FrenchFry("Large", "Spring","Salty","Very Hot",true);
		fries4.display();
		
		System.out.println("\nReference Fries5\n");
		
		FrenchFry fries5 = new FrenchFry("Large", "Spring","Salty","Very Hot",true,100);
		fries5.display();
		
		System.out.println("\nReference Fries6\n");
		
		FrenchFry fries6 = new FrenchFry("Large", "Spring","Salty","Very Hot",true,100,7.5f);
		fries6.display();
		
		System.out.println("\nReference Fries7\n");
		
		FrenchFry fries7 = new FrenchFry("Large", "Spring","Salty","Very Hot",true,100,7.5f,1);
		fries7.display();
		
		System.out.println("\nReference Fries8\n");
		
		FrenchFry fries8 = new FrenchFry("Large", "Spring","Salty","Very Hot",true,100,7.5f,1,"Golden Yellow");
		fries8.display();
		
		System.out.println("\nReference Fries9\n");
		
		FrenchFry fries9 = new FrenchFry("Large", "Spring","Salty","Very Hot",true,100,7.5f,1,"Golden Yellow",25);
		fries9.display();

	}

}
