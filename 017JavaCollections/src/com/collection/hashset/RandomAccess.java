package com.collection.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomAccess {
	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt();
		System.out.println("default random number of x:" + x);
		int y=random.nextInt(100);
		System.out.println("setting boundaries to the random number y:"+y);
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			int number=random.nextInt(10);
			list.add(number);
			System.out.println(list);
			
//		}
//		System.out.println(list);
//		Set<Integer>set=new HashSet<>(list);
//		System.out.println(set);
		}}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
