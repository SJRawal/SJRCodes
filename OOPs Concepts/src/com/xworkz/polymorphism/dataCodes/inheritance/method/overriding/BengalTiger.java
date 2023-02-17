package com.xworkz.polymorphism.dataCodes.inheritance.method.overriding;

public class BengalTiger extends Tiger {
	{
		System.out.println("Bengal Tiger class started");
	}

	@Override
	public void setAge(int age) {
		this.age = age;
		System.out.println(age);
	}
}
