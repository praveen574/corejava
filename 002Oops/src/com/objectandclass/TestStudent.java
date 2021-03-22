package com.objectandclass;

public class TestStudent {
	public static void main(String[] args) {
//		Student stu = new Student();
		//through ref variable
//		stu.id = 102;
//		stu.name = "praveen";
//		System.out.println(stu.id + " " + stu.name);
//	}

		Student s1 = new Student();
		Student s2 = new Student();
		//through method
		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();
	}
}
