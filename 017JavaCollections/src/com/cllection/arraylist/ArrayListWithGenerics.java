package com.cllection.arraylist;

import java.util.ArrayList;

public class ArrayListWithGenerics {
	public static void main(String[] args) {
		ArrayList<Object> arraylist = new ArrayList<Object>();
		
		arraylist.add(new Integer (10));
		arraylist.add(new Double(23.45));
		arraylist.add("praveen");
		arraylist.add(new Float(43.66f));
		arraylist.add(new Character('d'));
		System.out.println(arraylist);

	}

}
