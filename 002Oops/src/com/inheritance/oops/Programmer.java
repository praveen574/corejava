package com.inheritance.oops;

public class Programmer extends Employee {
	void eat() {
		System.out.println("eating");
	}
	@Override
	void sleep() {
		System.out.println("abc");
		// TODO Auto-generated method stub
		super.sleep();
	}
	public static void main(String[] args) {
		Programmer p=new Programmer();
		p.eat();
		p.sleep();
		p.age=34;
		p.name="praveen";
		p.salary=25000;
		p.display();
	}
	
}


