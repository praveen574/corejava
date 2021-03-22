package com.objectandclass;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.insert(12, "praveen", 23000);
		e2.insert(13, "naveen", 22000);
		e3.insert(15, "rakesh", 24000);
		e1.display();

	}

}
