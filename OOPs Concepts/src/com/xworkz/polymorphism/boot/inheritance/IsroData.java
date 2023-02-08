package com.xworkz.polymorphism.boot.inheritance;

import com.xworkz.polymorphism.dataCodes.inheritance.Isro;
import com.xworkz.polymorphism.dataCodes.inheritance.Scientist;

public class IsroData {

	public static void main(String[] args) {
		Isro isro = new Isro();
		Scientist scientist1 = new Scientist();
		Scientist scientist2 = new Scientist();

		String[] locs = { "Bengaluru", "Thiruvanantapuram", "Hassan" };
		isro.setlocations(locs);

		int[] satNos = { 13, 21, 81, 9 };
		isro.setsatelliteNos(satNos);

		scientist1.setScientists("Vikram Sarabhai");
		scientist1.setDesignations("Founder");

		scientist2.setScientists("Rakesh Sharma");
		scientist2.setDesignations("Space Explorer");

		Scientist[] satellites = { scientist1, scientist2 };

		isro.setScientist(satellites);

		isro.show();

		String name = "Sumith";
		char[] values = name.toCharArray();
		System.out.println(values.length);
		if (values[0] == values[1]) {

		}

	}

}
