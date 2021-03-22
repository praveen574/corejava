package com.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<String>queue=new PriorityQueue<>(new MyComparator());
		  queue.add("praveen");
	        queue.add("naveen");
	        queue.add("khan");
	        queue.add("pavankalyan");
//	        System.out.println(queue.peek());
//	        System.out.println(queue.poll());
//	    queue.remove();
//	        System.out.println(queue);
//	}
	        while (queue.size() != 0)
	        {
	            System.out.println(queue.poll());
	        
	        }
}}
