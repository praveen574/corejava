package com.vidvan.generics;

public class GenericMethod3 {
	
public static <E> void printArray(E[] inputArray){
	for (E e : inputArray) {
		System.out.println(e);
	}
}
public static void main(String[] args) {
	Integer[]integerarray= {1,2,3,4,5};
	Character[]chararray= {'a','v','c','f'};
	printArray(integerarray);
	System.out.println();
	printArray(chararray);
			
			
			
			
			
}
}
