package com.xworkz.polymorphism.boot.inheritance;

import com.xworkz.polymorphism.dataCodes.inheritance.Apple;
import com.xworkz.polymorphism.dataCodes.inheritance.Bengaluru;
import com.xworkz.polymorphism.dataCodes.inheritance.Breakfast;
import com.xworkz.polymorphism.dataCodes.inheritance.Dog;
import com.xworkz.polymorphism.dataCodes.inheritance.Dosa;
import com.xworkz.polymorphism.dataCodes.inheritance.ElectronicGadget;
import com.xworkz.polymorphism.dataCodes.inheritance.Instiute;
import com.xworkz.polymorphism.dataCodes.inheritance.MetroCity;
import com.xworkz.polymorphism.dataCodes.inheritance.Mysore;
import com.xworkz.polymorphism.dataCodes.inheritance.PalaceCity;
import com.xworkz.polymorphism.dataCodes.inheritance.PetAnimal;
import com.xworkz.polymorphism.dataCodes.inheritance.Phone1;
import com.xworkz.polymorphism.dataCodes.inheritance.Star;
import com.xworkz.polymorphism.dataCodes.inheritance.Sun;
import com.xworkz.polymorphism.dataCodes.inheritance.TechCompany;
import com.xworkz.polymorphism.dataCodes.inheritance.XworkZ;

public class Feb13Data {

	public static void main(String[] args) {
		TechCompany techCompany = new TechCompany();
		Apple apple = new Apple();
		TechCompany tech = new Apple();

		Breakfast breakfast = new Breakfast();
		Dosa dosa = new Dosa();
		Breakfast breakfast1 = new Dosa();

		ElectronicGadget electronicGadget = new ElectronicGadget();
		Phone1 phone = new Phone1();
		ElectronicGadget electronicGadget1 = new Phone1();

		MetroCity metroCity = new MetroCity();
		Bengaluru bengaluru = new Bengaluru();
		MetroCity metroCity1 = new Bengaluru();

		Instiute instiute = new Instiute(true);
		XworkZ xworkZ = new XworkZ(false);
		Instiute instiute1 = new XworkZ(true);

		Star star = new Star();
		Sun sun = new Sun();
		Star star1 = new Sun();

		PalaceCity palaceCity = new PalaceCity(1000000000);
		Mysore mysore = new Mysore("Karnataka");
		PalaceCity palaceCity1 = new Mysore(null);

	}

}
