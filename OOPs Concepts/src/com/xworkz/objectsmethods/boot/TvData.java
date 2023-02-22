package com.xworkz.objectsmethods.boot;

import com.xworkz.objectsmethods.data.Tv;

public class TvData {

	public static void main(String[] args) {
		Tv tv = new Tv("LG", 55000, 75.5f);
		Tv tv2 = new Tv("Sony", 45000, 75.5f);
		System.out.println(tv.equals(tv2));
		Tv tv3 = new Tv("LG", 55000, 75.5f);
		System.out.println(tv.equals(tv3));
	}

}
