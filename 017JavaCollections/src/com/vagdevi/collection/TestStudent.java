package com.vagdevi.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestStudent {
public static void main(String[] args) {
	
	Student s1=new Student(101, "praveen", 20000.0f);
	Student s2=new Student(102, "naveen", 30000.0f);
	Student s3=new Student(103, "vinod", 25000.0f);
	Student s4=new Student(104, "krishna", 22000.0f);
	Student s5=new Student(105, "suneel", 26000.0f);
	Student s6=new Student(104, "krishna", 22000.0f);

	List<Student>l=new ArrayList<Student>();
	//Set<Student>l=new HashSet<Student>();
	l.add(s1);
	l.add(s2);
	l.add(s3);
	l.add(s4);
	l.add(s5);
	l.add(s6);
	//System.out.println(l);
	
	Iterator<Student>itr=l.iterator();
	while(itr.hasNext()) {
		Student st=itr.next();
		System.out.println(st);
	}
	
	
	
	
	

}
}
