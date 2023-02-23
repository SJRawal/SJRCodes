package com.xworkz.objectsmethods.data;

public class Person {
	public int id;
	public String name;
	public int age;
	public String email;
	
	public Person(int id, String name, int age, String email) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.email=email;
	}
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public Person(int id, String name, String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person: "+this.id+" Name: "+this.name+" Age: "+this.age+" Email: "+this.email;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 123456;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in " + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Person) {
				System.out.println("obj is Person type,can comapre");
				Person casted = (Person)obj;
				Person person = this;
				Person person2 = casted;
				if(person.id==person2.id && person.name.equals(person2.name) && person.age==person.age && person.email.equals(person2.email)) {
					System.out.println("Bpth classes are same");
				return true;	
				} else {
					System.err.println("Person and Person2 not same");
				}
			}else {
				System.err.println("obj is not person,won't compare");
			}
		}else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

}
