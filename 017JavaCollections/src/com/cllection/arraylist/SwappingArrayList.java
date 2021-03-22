package com.cllection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingArrayList {
	public static void main(String a[]){
	    ArrayList<String> al = new ArrayList<String>();
	    al.add("Sachin");
	    al.add("Rahul");
	    al.add("Saurav");
	    al.add("Sunil");
	    al.add("Kapil");
	    al.add("Vinod");

	    System.out.println("ArrayList before Swap:");
	    System.out.println(al);
	    Collections.swap(al, 1, 3);
	    System.out.println("after swapping:"+al);

}
}