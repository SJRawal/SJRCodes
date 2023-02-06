package com.xworkz.polymorphism.dataCodes.constructor;

public class Message {
    public String sender;
    public String receiver;
    public int messageBody;
    public float time;
    public int messageStatus;
    
    public Message(String s) {
    	sender=s;

    }
    public Message(String s,String r) {
    	sender=s;
    	receiver = r;

    }
    public Message(String s,String r,int m) {
    	sender=s;
    	receiver = r;
    	messageBody=m;

    }
    public Message(String s,String r,int m,float t) {
    	sender=s;
    	receiver = r;
    	messageBody=m;
    	time=t;
    }
    public Message(String s,String r,int m,float t,int mS) {
    	sender=s;
    	receiver = r;
    	messageBody=m;
    	time=t;
    	messageStatus=mS;
    }
    public void showMessage() {
    	System.out.println("Message Sender "+sender);
    	System.out.println("Message receiver "+receiver);
    	System.out.println("Message message Body total lines "+messageBody);
    	System.out.println("Message time "+time);
    	System.out.println("Message message Status(0-Sent, 1-Delivered, 2-Read) "+messageStatus);
    }
}
