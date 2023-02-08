package com.xworkz.polymorphism.boot.inheritance;

import com.xworkz.polymorphism.dataCodes.inheritance.Doctor;
import com.xworkz.polymorphism.dataCodes.inheritance.Hospital;

public class HospitalSData {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		Doctor doctor = new Doctor();
		Doctor doctor1 = new Doctor();
		hospital.setName("Ramaiah Hospital");
		doctor.setName("Dr. Anil Kumar V R ");
		String[] specs = { "Accident & Trauma", "Emergency Medicine Department", "surgical & Medical emergencies" };
		doctor.setSpecilization(specs);
		doctor.setExperience(25);

		doctor1.setName("Dr. Ravi Shankar Shetty  ");
		String[] specs1 = { "Consultant Cardiothoracic Surgeon", "General Surgery", "Cardio Thoracic Surgery " };
		doctor1.setSpecilization(specs1);
		doctor1.setExperience(14);

		Doctor[] doctor2 = { doctor, doctor1 };
		hospital.setDoctor(doctor2);
		hospital.getDisplay();

	}

}
