package com.xworkz.polymorphism.dataCodes.inheritance.method.overriding;

public class Converter {

	public void display(Sport sport) {
		T20Cricket t20Cricket = new T20Cricket();
		String t20 = t20Cricket.getSponserName("DLF IPL");
		System.out.println(t20);
		String t202 = t20Cricket.getGroundName("ChinnaSwamy Stadium");
		System.out.println(t202);
		String t203 = t20Cricket.getCountry("India");
		System.out.println(t203);
		int t204 = t20Cricket.getTotal(263);
		System.out.println(t204);
		Cricket test = new T20Cricket();
		TestCricket test2 = (TestCricket) test;
		test2.getCaptainName("Virat Kohli");
	}

}
