package com.vidvan.oops;

public class Employee {
	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display() {
		System.out.println(id+""+name);
		System.out.println(address.city+" "+address.State+" "+address.country);  
		
	}
	public static void main(String[] args) {
		
		Address a1=new Address("HYD", "TELANGANA", "INDIA");
		Address a2=new Address("VIZAG", "ANDHRA", "INDIA");

		Employee e1=new Employee(101, "praveen", a1);
		Employee e2=new Employee(102, "pavan", a2);
e1.display();
e2.display();
	}
	
	
	

}
