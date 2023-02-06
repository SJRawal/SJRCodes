package com.xworkz.polymorphism.boot.constructor;

import com.xworkz.polymorphism.dataCodes.constructor.Message;

public class MessageData {

	public static void main(String[] args) {
		System.out.println("Reference Message");
		
		Message message = new Message("Sumith");
		message.showMessage();
		
		System.out.println("\nReference Message1\n");
		
		Message message1 = new Message("Sumith", "Can't Disclose");
		message1.showMessage();
		
		System.out.println();
		
		Message message2 = new Message("Sumith","Can't Disclose", 10);
		message2.showMessage();
		
		System.out.println("\nReference Message3\n");
		
		Message message3= new Message("Sumith", "Can't Disclose", 10, 5.30f);
		message3.showMessage();
		
		System.out.println("\nReference Message4\n");
		
		Message message4 = new Message("Sumith", "Can't Disclose", 10, 5.30f, 2);
		message4.showMessage();
	}

}
