package com.vidvan.cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "test1", 15000.0));
		employees.add(new Employee(2, "test2", 15000.0));
		employees.add(new Employee(3, "test3", 15000.0));
		employees.add(new Employee(4, "test4", 15000.0));

//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
//for(int i=0;i<employees.size();i++) {
//	System.out.println(employees.get(i));
//	
//}
		int count = 0;
		while (employees.size() > count) {
			System.out.println(employees.get(count));
			count++;

	}
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext());
			
		System.out.println(itr.hasNext());

}
}