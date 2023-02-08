package com.xworkz.polymorphism.boot.inheritance;

import com.xworkz.polymorphism.dataCodes.inheritance.Degree;
import com.xworkz.polymorphism.dataCodes.inheritance.Engineer;

public class EngineerData {

	public static void main(String[] args) {
		Engineer engg = new Engineer();
		Degree degree = new Degree();
		Degree degree1 = new Degree();
		engg.setName("Sumith");
		engg.setSalary(49000.33);
		String[] ski = { "Java", "MATLAB", "Computer Communication Networks" };
		engg.setSkills(ski);

		degree.setName("Sumith J Rawal");
		degree.setBranch("Telecommunication ommunication Engg");
		degree.setDuration(3);
		degree.setPercentage(6.53);
		degree.setPursuing(false);

		degree1.setName("Chethan B M");
		degree1.setBranch("Electronics and Instrumentation Engg");
		degree1.setDuration(3);
		degree1.setPercentage(7.03);
		degree1.setPursuing(true);
		Degree[] degreeArray = { degree, degree1 };
		engg.setDegreeCode(degreeArray);
		engg.display();

	}

}
