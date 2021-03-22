 package com.vagdevi.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) {
		List l=new ArrayList ();
		for(int i=0;i<10;i++) {
			l.add(i);
			
		}
		System.out.println(l);
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			Integer integer=(Integer) itr.next();
			if(integer % 2==0) {
				System.out.println(integer);
				
			}else {
				itr.remove();
				System.out.println(l);
			}
		}
		
	}

}
