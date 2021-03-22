package com.constructor.oops;

public class Test {
	public static void main(String[] args) {
		Employee e= new Employee(23,"naveen",34000.00);
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setName("paul");
		System.out.println("name=" + s1.getName());
		s1.setGpa(3);
		System.out.println("gpa=" + s1.getGpa());
		System.out.println();
		s2.setName("peter");
		s2.setGpa(5);
		System.out.println("name=" + s2.getName());
		System.out.println("gpa=" + s2.getGpa());

e.display();
	}

}
