package com.vidvan.generics;

public class SampleTest {
	
	public static void main(String[] args) {
		Sample<Integer>sample=new Sample<>();//ok
		sample.setType(24);
		System.out.println(sample.getType());
		
		
		//Sample<String>sampl=new Sample<>();//Bounded is integer type
		
//		Sample sample=new Sample("praveen");
//		sample.getType();
//		System.out.println(sample.getType());
//		
//		
//		Sample<String>s=new Sample<>("naveen");
//		s.getType();
//		s.setType("pavan");
//		s.showType();
//	
//		System.out.println(s.getType());

}}
