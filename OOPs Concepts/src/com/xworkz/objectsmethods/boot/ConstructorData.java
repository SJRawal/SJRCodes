package com.xworkz.objectsmethods.boot;

import com.xworkz.objectsmethods.data.Doctor;
import com.xworkz.objectsmethods.data.Engineer;

public class ConstructorData {

	public static void main(String[] args) {
		Engineer engg = new Engineer(123456, "SJR", 23, "rsumithj@gmail.com");
		Engineer engg2 = new Engineer(123456, "SJR", 24, "sumithjrawal.xworkz@gmail.com");
		System.out.println(engg.equals(engg2));
		System.out.println(engg2.hashCode()+" Original HashCode: "+System.identityHashCode(engg2));
		
		Engineer engg1 = new Engineer(123456, "SJR", 23, "rsumithj@gmail.com");
		System.out.println(engg.equals(engg1));
		
		
		System.out.println("Docter class Running");
		Doctor doctor = new Doctor(987654, "XYZ", 55, "abclmn@zyx.com", "HeartSpecialist", "Mruthyu Hospital");
		Doctor doctor2 = new Doctor(987654, "XYZ", 55, "abclmn@zyx.com", "HeartSpecialist", "Mruthyu Hospital");
		System.out.println(doctor.equals(doctor2));
		System.out.println(doctor.hashCode()+" Orginal HashCode: "+System.identityHashCode(doctor));
		
		System.out.println(engg.equals(doctor2));
	}

}
