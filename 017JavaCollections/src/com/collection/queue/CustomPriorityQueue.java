package com.collection.queue;

import java.util.PriorityQueue;

import com.collection.treeset.MyStringBufferComparator;

public class CustomPriorityQueue {
	public static void main(String[] args) {
		MyStringBufferComparator mycom = new MyStringBufferComparator();
		PriorityQueue<StringBuffer> queue = new PriorityQueue<>(mycom);
		queue.add(new StringBuffer("praveen"));
		queue.offer(new StringBuffer("naveen"));
		queue.add(new StringBuffer("vidvan"));
		queue.offer(new StringBuffer("sai"));
		queue.add(new StringBuffer("sekhar"));
		queue.offer(new StringBuffer("remove"));
		
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue.peek());

		System.out.println(queue.poll());// it returns null when there is no elements
		System.out.println(queue.remove());

		System.out.println(queue);

	}
}
