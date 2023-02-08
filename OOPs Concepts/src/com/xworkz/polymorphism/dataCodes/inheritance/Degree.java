package com.xworkz.polymorphism.dataCodes.inheritance;

public class Degree {
	public String name;
	public int duration;
	public boolean pursuing;
	public double percentage;
	public String branch;

	public void setName(String name) {
		this.name = name;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setPursuing(boolean pursuing) {
		this.pursuing = pursuing;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void getDegree() {
		System.out.print("\n Degree class message printing started i.e. Associate class \n");
		System.out.println("Graduate name " + this.name);
		System.out.println("Graduation duration " + this.duration + " years");
		System.out.println("Still pursuing degree? " + this.pursuing);
		System.out.println("CGPA in Graduation " + this.percentage);
		System.out.println("Graduation branch " + this.branch);
	}

	public void setDegreeCode(Degree[] degreeArray) {
		// TODO Auto-generated method stub

	}

}
