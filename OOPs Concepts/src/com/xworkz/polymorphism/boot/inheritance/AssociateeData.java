package com.xworkz.polymorphism.boot.inheritance;

import com.xworkz.polymorphism.dataCodes.inheritance.Phone;
import com.xworkz.polymorphism.dataCodes.inheritance.Shirt;
import com.xworkz.polymorphism.dataCodes.inheritance.Xworkz;

public class AssociateeData {

	public static void main(String[] args) {
		Xworkz xworkz = new Xworkz();
		xworkz.showXworkz();

		Phone mobile = new Phone();
		mobile.openMobile();
		
		Shirt shirt = new Shirt();
		shirt.showShirt();

	}

}
