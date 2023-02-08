package com.xworkz.polymorphism.dataCodes.inheritance;

public class Hospital {
	public String name;
	public Doctor[] docter;

	public void setName(String name) {
		this.name = name;
	}

	public void setDoctor(Doctor[] docter) {
		this.docter = docter;
	}

	public void getDisplay() {
		System.out.println("Name of the Hospital is " + name);
		if (this.docter != null) {
			for (int count = 0; count < this.docter.length; count++) {
				Doctor elements = this.docter[count];
				elements.displayDoctor();
			}
		} else {
			System.err.println("This Satellite is nulll");
		}
	}
}
