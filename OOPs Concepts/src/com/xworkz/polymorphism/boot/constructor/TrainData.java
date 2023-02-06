package com.xworkz.polymorphism.boot.constructor;

import com.xworkz.polymorphism.dataCodes.Train;

public class TrainData {

	public static void main(String[] args) {
		
		System.out.println("Reference Train");
		Train train = new Train(17391);
		train.ShowTrain();
		
		System.out.println("\nReference Train1\n");
		Train train1 = new Train(17391, "SBC UBL EXP");
		train1.ShowTrain();
		
		System.out.println("\nReference Train2\n");
		Train train2 = new Train(17391, "\"SBC UBL EXP\"", "Bengalur");
		train2.ShowTrain();
		
		System.out.println("\nReference Train3\n");
		Train train3 = new Train(17391, "SBC UBL EXP", "Bengalur", "Hubli");
		train3.ShowTrain();
		
		System.out.println("\nReference Train4\n");
		Train train4 = new Train(17391, "SBC UBL EXP", "Bengalur", "Hubli", "9:00");
		train4.ShowTrain();
		
		System.out.println("\nReference Train5\n");
		Train train5 = new Train(17391, "SBC UBL EXP", "Bengalur", "Hubli", "9:00", "9:25");
		train5.ShowTrain();
		
		System.out.println("\nReference Train6\n");
		Train train6 = new Train(17391, "SBC UBL EXP", "Bengalur", "Hubli", "9:00", "9:25", 564);
		train6.ShowTrain();
		
		System.out.println("\nReference Train7\n");
		Train train7 = new Train(17391, "SBC UBL EXP", "Bengalur", "Hubli", "9:00", "9:25", 564, 36);
		train7.ShowTrain();
		

	}

}
