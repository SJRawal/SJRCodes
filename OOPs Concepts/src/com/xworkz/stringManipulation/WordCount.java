package com.xworkz.stringManipulation;

public class WordCount {
public static void main(String[] args) {
	String data = "I am doing because this was given as assignment";
	System.out.println("Total words in Sentence: "+data.split(" ").length);
	
	String data2 = "This is a java";
	String[] count=data2.split(" ");
	int wordCount=0;
	for(int i=0;i<count.length;i++) {
		if(count[i].contains("java")) {
			wordCount++;
			
			String reverse = "";
			for (int j = count[i].length()-1;j>=0;j--) {
				reverse += count[i].charAt(j);
			}
			count[i]=reverse;
		}
		}
		String revData=String.join(" ", count);
		System.out.println("Total time of occurance: "+wordCount);
		System.out.println(revData);
	}
	
}
