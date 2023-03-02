package com.xworkz.polymorphism.dataCodes.inheritance.method.overriding;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringManipulation {
	public static void main(String[] args) {
	String name = "Sumith";
		String name2 = new String("Rawal");
		char ch[] = {'H','e','l','l','o'};
		String str = new String(ch);
		System.out.println(str);
		byte[] arr = {83,117,109,105,116,104};
		String name3 = new String(arr);
		System.out.println(name3);
		byte[] bArr = {-27, -115, -103, -26, -103, -127, -27, -91, -67};
		Charset charr = Charset.forName("ISO-8859-1");
		String charByte = new String(bArr,charr);
		System.out.println(charByte);
		byte[] bArr1 = {99, 114, 108, 102, 102};
		try {
			String str3 = new String(bArr1, "US-ASCII");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str);
		
		char manip[]= {'h','e','l','l','o'};
		String world = new String(manip,1,3);
		System.out.println(world);
		
		StringBuffer sb = new StringBuffer("Rawal");
		String name5 = new String(sb);
		System.out.println(name5);
		
		String ss = "Java Code";
		System.out.println(ss.split(" ").length);
		String[] word = ss.split(" ");
		for(String w:word) {
			System.out.println(w);
			
		}
		boolean rev = ss.equals("Code");
		
	}

}
