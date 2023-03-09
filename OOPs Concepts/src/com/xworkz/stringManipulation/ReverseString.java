package com.xworkz.stringManipulation;

public class ReverseString {
	public static String reverseStr(String str) {
	char ch[]=str.toCharArray();
	String rev = "";
	for(int i=str.length()-1;i>=0;i--) {
	rev+=ch[i];	
	}
	return rev;
}
	public static void main(String[] args) {
		String name = "Xworkz";
		System.out.println("Original String "+name+" Reversed String "+reverseStr(name));
	}
}
	
