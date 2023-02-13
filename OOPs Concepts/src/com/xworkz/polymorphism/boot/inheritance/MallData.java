package com.xworkz.polymorphism.boot.inheritance;

import com.xworkz.polymorphism.dataCodes.inheritance.Company;
import com.xworkz.polymorphism.dataCodes.inheritance.Country;
import com.xworkz.polymorphism.dataCodes.inheritance.Mall;
import com.xworkz.polymorphism.dataCodes.inheritance.Security;
import com.xworkz.polymorphism.dataCodes.inheritance.State;
import com.xworkz.polymorphism.dataCodes.inheritance.Address;
import com.xworkz.polymorphism.dataCodes.inheritance.Area;
import com.xworkz.polymorphism.dataCodes.inheritance.City;

public class MallData {

	public static void main(String[] args) {

		Area air = new Area(null, 0, null);
		City cit = new City(null, null, null, air);
		State ste = new State(null, null, null, cit);
		Country cty = new Country(null, null, false, ste);
		Address add = new Address(cty);
		Company com = new Company(null, null, 0, add);
		Security seq = new Security(null, 0, 0, com);
		Mall mall = new Mall(null, false, 0, seq);
		mall.showMall();

	}

}
