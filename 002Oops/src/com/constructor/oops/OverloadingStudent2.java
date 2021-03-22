package com.constructor.oops;

public class OverloadingStudent2 {
	public static void main(String[] args) {
		Student2 s1=new Student2(101, "praveen");
		Student2 s2=new Student2(102, "pavan", 23);
		s1.display();
		s2.display();
		
	}

}
