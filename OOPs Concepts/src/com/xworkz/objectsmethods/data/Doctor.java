package com.xworkz.objectsmethods.data;

public class Doctor extends Person{
	private String specialist;
	private String hospitalName;
public Doctor(int id, String name, int age, String email,String specialist,String hospitalName) {
		super(id, name, age, email);
		this.specialist=specialist;
		this.hospitalName=hospitalName;
		// TODO Auto-generated constructor stub
	}

}
