package com.vidvan.calbyvalue;

public class Callbyvalue {
	int a=100;
	void change (int a) {
		a=a+45;
	}
	public static void main(String[] args) {
		Callbyvalue c=new Callbyvalue();
		System.out.println("before="+c.a);
		c.change(200);
		System.out.println("after="+c.a);
	}
	

}
