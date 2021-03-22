package com.collection.hashset;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		 HashSet<String> set=new HashSet<String>();  
         set.add("Ravi");  
         set.add("Vijay");  
         set.add("Arun");  
         set.add("Sumit");  
         System.out.println("An initial list of elements: "+set);  
         //Removing specific element from HashSet 
         set.remove("Vijay");
         System.out.println("After invoking remove(object) method: "+set);  
         HashSet<String> set1=new HashSet<String>();  
set1.add("Praveen");
set1.add("Naveen");
set1.add("Pavan");
set.addAll(set1);
System.out.println("after updating list:"+set);

set.removeIf(str->str.contains("Praveen"));    

System.out.println("after updating list:"+set);


	}

}
