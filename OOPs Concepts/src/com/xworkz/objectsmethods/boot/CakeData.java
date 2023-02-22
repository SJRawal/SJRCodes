package com.xworkz.objectsmethods.boot;

import com.xworkz.objectsmethods.data.Cake;

public class CakeData {

	public static void main(String[] args) {
		Cake cake = new Cake("BlackCurrent", 1000, "Ovel", 450.99f);
		Cake cake2 = new Cake("Dark Forest", 1000, "Round", 550.99f);
		System.out.println(cake.equals(cake2));
		Cake cake3 = new Cake("Dark Forest", 1000, "Round", 550.99f);
		System.out.println(cake2.equals(cake3));
	}

}
