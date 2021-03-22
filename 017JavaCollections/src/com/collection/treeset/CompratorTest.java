package com.collection.treeset;

import java.util.Comparator;

public class CompratorTest implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;

	
 if(i1>i2) 
		return 1;
 
 if(i1<i2);
 return -1;
 
		
	}
 

}
