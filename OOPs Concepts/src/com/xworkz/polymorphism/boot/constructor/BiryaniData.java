package com.xworkz.polymorphism.boot.constructor;

import com.xworkz.polymorphism.dataCodes.constructor.Biryani;

public class BiryaniData {

	public static void main(String[] args) {
System.out.println("Reference Biryani");
		
		Biryani biryani = new Biryani("Basumat");
		biryani.display();
		
		System.out.println("\nReference Biryani1\n");
		
		Biryani biryani1 = new Biryani("Jeera Samba", "Chicken");
		biryani1.display();
		
		System.out.println("\nReference Biryani2\n");
		
		Biryani biryani2 = new Biryani("Jeera Samba", "Mutton", 13);
		
		biryani2.display();
		
		System.out.println("\nReference Biryani3\n");
		
		Biryani biryani3= new Biryani("Jeera Samba", "Mutton",13, false);
		biryani3.display();
		
		System.out.println("\nReference Biryani4\n");
		
		Biryani biryani4 = new Biryani("Jeera Samba", "Mutton",13, false, true);
		biryani4.display();
		
		System.out.println("\nReference Biryani5\n");
		
		Biryani biryani5 = new Biryani("Jeera Samba", "Mutton",13, false, true, 3);
		biryani5.display();
		
		System.out.println("\nReference Biryani6\n");
		
		Biryani biryani6 = new Biryani("Jeera Samba", "Mutton",13, false, true, 3,5.0f);
		biryani6.display();
		
		System.out.println("\nReference Biryani7\n");
		
		Biryani biryani7 = new Biryani("Jeera Samba", "Mutton",13, false, true, 3,5.0f, "On Dum");
		biryani7.display();
		
		System.out.println("\nReference Biryani8\n");
		
		Biryani biryani8 = new Biryani("Jeera Samba", "Mutton",13, false, true, 3,5.0f, "On Dum", 4);
		biryani8.display();
		
		System.out.println("\nReference Biryani9\n");
		
		Biryani biryani9 = new Biryani("Jeera Samba", "Mutton",13, false, true, 3,5.0f, "On Dum", 4, 1.5f);
		biryani9.display();
		
		System.out.println("\nReference Biryani10\n");
		
		Biryani biryani10 = new Biryani("Jeera Samba", "Chicken",13, false, true, 3,5.0f, "On Dum", 4, 1.5f,"Donne");
		biryani10.display();

		System.out.println("\nReference Biryani11\n");
		
		Biryani biryani11 = new Biryani("Jeera Samba", "Mutton",13, false, true, 3,5.0f, "On Dum", 4, 1.5f,"Donne",1);
		biryani11.display();

		System.out.println("\nReference Biryani12\n");
		
		Biryani biryani12 = new Biryani("Jeera Samba", "Mutton",13, false, true, 3,5.0f, "On Dum", 4, 1.5f,"Donne",1,"Spicy");
		biryani12.display();

		System.out.println("\nReference Biryani13\n");
		
		Biryani biryani13 = new Biryani("Jeera Samba", "Mutton",13, false, true, 3,5.0f, "On Dum", 4, 1.5f,"Donne",1,"Spicy",5);
		biryani9.display();

		System.out.println("\nReference Biryani14\n");
		
		Biryani biryani14 = new Biryani("Jeera Samba", "Mutton",13, false, true, 3,5.0f, "On Dum", 4, 1.5f,"Donne",1,"Spicy",5,"Fresh");
		biryani14.display();
		


	}

}
