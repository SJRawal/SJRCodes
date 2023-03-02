package com.xworkz.stringManipulation;

public class DupReplace {
	
	public static void main(String[] args) {
		String input = "I am doing because this was given as assignment";
		System.out.println("Original String: "+input);
		
		String output="";
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(output.indexOf(ch)==-1) {
				output += ch;
			}else {
				output += " ";
			}
			
		}
		System.out.println(output);
	}

}
