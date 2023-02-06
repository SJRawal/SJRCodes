package com.xworkz.polymorphism.dataCodes.constructor;
import com.xworkz.polymorphism.boot.constructor.Medal;
public class MedalData {

	public static void main(String[] args) {
		Medal medal=new Medal("Olympic", "2020 Summer Olympics","India", 1, 2, 4, 2020, true, false, 7, "Neeraj Chopra", "Men's javelin throw", "Tokyo", "Japan");
		medal.Display();

		System.out.println("----------------------- \n Another Event Details \n -----------------------");
		
		Medal medal1=new Medal("Rio Olympic", "2016 Summer Olympics","India", 0, 1, 1, 2016, true, false, 2, "P. V. Sindhu", "Badminton Women's singles", "Rio de Janeiro", "Brazil");
		medal1.Display();
	}

}
