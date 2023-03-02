package com.xworkz.stringManipulation;

public class DeleteDupWord {

	public static void main(String[] args) {
		String result = "";
		
		String sentence = " Find the word word and word in the string to count and reverse it and word";
		String words[] = sentence.split(" ");
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].contains(words[j])) {
					words[j]="delete";
				}
			}
		}
		for(String data:words) {
			if(data!="delete") {
				result = result +data + " ";
			}
		}
		System.out.println(result);
	}

}
