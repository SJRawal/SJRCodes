package com.xworkz.polymorphism.boot.inheritance;

import com.xworkz.polymorphism.dataCodes.inheritance.Phone;
import com.xworkz.polymorphism.dataCodes.inheritance.Shirt;
import com.xworkz.polymorphism.dataCodes.inheritance.Xwork;

public class AssociateeData {

	public static void main(String[] args) {
		Xwork xworkz = new Xwork();
		xworkz.showXworkz();

		Phone mobile = new Phone();
		mobile.openMobile();
		
		Shirt shirt = new Shirt();
		shirt.showShirt();

	}

}
