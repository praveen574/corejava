package com.vidvan.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardParams {
	public void disp(ArrayList<?> al) {
		// it will add only null insertion
		al.add(null);

		// al.add("")

	}

	public static void main(String[] args) {
		WildCardParams w = new WildCardParams();
		w.disp(new ArrayList<Thread>());
		List<?> list = new ArrayList<>();
		list.add(null);
//list.add("");
//list.get(100);
//System.out.println(list.remove(100));
		System.out.println(list.removeAll(list));

	}

}
