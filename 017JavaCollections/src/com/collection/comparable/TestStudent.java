package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
//		ArrayList<Student> al = new ArrayList<Student>();
		TreeSet<Student>al=new TreeSet<>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

//		Collections.sort(al);


		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}
