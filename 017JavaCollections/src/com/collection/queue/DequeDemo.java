package com.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();

		deque.add("Ravi");
		deque.add("Vijay");
		deque.add("Ajay");
		deque.offer("praveen");
		deque.offer("pavan");
//		deque.offerFirst("prashanth");//insert at first
	//	deque.offerLast("khan");//insert at last on queue
		deque.pollFirst();//removes First element
		deque.pollLast();//removes Last element
		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}
	}
}
