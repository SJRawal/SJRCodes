package com.xworkz.stringManipulation;

public class CompareStr {

	public static void main(String[] args) {
		String str1 = "xworkz";
		String str2 = "training";
		String str3 = "xworkz";
		
		System.out.println(str1+" and "+ str3 +" are equal "+str1.equals(str3));
		boolean checkStr = str1==str2;
		System.out.println(str1+" and "+ str2 +" are equal "+checkStr);
		int check = str1.compareTo(str3);
		if(check==0) {
			System.out.println(str1+" and "+ str3 +" are equal "+true);
		}
	}

}
