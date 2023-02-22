package com.xworkz.objectsmethods.boot;

import com.xworkz.objectsmethods.data.FootWare;

public class FootWareData {

	public static void main(String[] args) {
		FootWare footWare = new FootWare("Paragon", 10, false);
		FootWare footWare2 = new FootWare("WoodLand", 10, true);
		System.out.println(footWare.equals(footWare2));
		FootWare footWare3 = new FootWare("WoodLand", 10, true);
		System.out.println(footWare2.equals(footWare3));
	}

}
