package com.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TestBook {
	public static void main(String[] args) {
		Map<Integer, Book> map = new TreeMap<Integer, Book>();
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		Book b4 = new Book(100, "Operating System", "Galvin", "Wiley", 8);
		map.put(1, b4);
		map.put(3, b3);
		map.put(2, b2);
		map.put(1, b1);
		for (Map.Entry<Integer, Book> entry : map.entrySet()) {
			int key = entry.getKey();
			Book b = entry.getValue();
			// System.out.println(key+" Details:");
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}

	}

}
