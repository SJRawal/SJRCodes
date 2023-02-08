package com.xworkz.polymorphism.dataCodes.inheritance;

public class Doctor {

	public String name;
	public String[] specilization;
	double experience;

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecilization(String[] specilization) {
		this.specilization = specilization;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public void displayDoctor() {
		System.out.println(this.name);
		for (int seq = 0; seq < this.specilization.length; seq++) {
			String speci = specilization[seq];
			System.out.println(speci);
		}
		System.out.println(this.experience);
	}

}
