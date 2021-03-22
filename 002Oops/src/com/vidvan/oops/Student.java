package com.vidvan.oops;

public class Student {
	int sId;
	String sName;
	double sFee;

	public void payfee() {

		System.out.println("fee paid");

	}

	public void display() {
		System.out.println("sId:" + sId);
		System.out.println("sName:" + sName);
		System.out.println("sId:" + sFee);
	}


	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sId = 1;
		s1.sName = "praveen";
		s1.sFee = 20000.00;
		s1.display();

		System.out.println("-------");

		Student s2 = new Student();
		s2.sId = 2;
		s2.sName = "khan";
		s2.sFee = 20000.00;
		s2.display();
	}

}
