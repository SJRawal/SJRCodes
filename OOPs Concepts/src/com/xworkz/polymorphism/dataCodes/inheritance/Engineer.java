package com.xworkz.polymorphism.dataCodes.inheritance;

public class Engineer {
	public String name;
	public double salary;
	public String[] skills;
	public Degree[] degreeCode;

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public void setDegreeCode(Degree[] degreeCode) {
		this.degreeCode = degreeCode;
	}

	public void display() {
		System.out.println("Name of the Engineer " + this.name);
		System.out.println("Salary of the Engineer " + this.name);

		if (this.skills != null) {
			for (int seq = 0; seq < this.skills.length; seq++) {
				String skill = skills[seq];
				System.out.println("Skills of the Engineer ");
				System.out.println(skill);
			}
		} else {
			System.err.println("He doesn't have any skills so it's null");
		}
		if (this.degreeCode != null) {
			for (int count = 0; count < this.degreeCode.length; count++) {
				Degree elements = this.degreeCode[count];
				elements.getDegree();
			}
		} else {
			System.err.println("This Satellite is nulll");
		}
	}
}
