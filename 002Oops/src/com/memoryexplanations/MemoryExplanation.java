package com.memoryexplanations;

public class MemoryExplanation {

	public static void main(String[] args) {
		System.out.println("main begin");
		int num1 = 5;
		System.out.println("hi");
		Employee e = new Employee();
		e.setEno(12);
		e.setName("praveen");
		e.setSalary(20000.00);
		e.display();

		System.out.println(e.getName());
		Person p = createPerson(45, "Eswar");
		display(p);
		System.out.println(num1);
		System.out.println("main end");

	}

	private static void display(Person p) {
		System.out.println(p.getPno());
		System.out.println(p.getName());

	}

	private static Person createPerson(int pno, String name) {
		Person person = new Person();
		person.setPno(pno);
		person.setName(name);

		return person;
	}

	private static void display(Employee emp) {
		System.out.println(emp.getName());
		System.out.println(emp.getEno());
		System.out.println(emp.getSalary());
		emp.setName("Mr." + emp.getName());
		int num2 = 6;
		System.out.println(num2);

	}

}
