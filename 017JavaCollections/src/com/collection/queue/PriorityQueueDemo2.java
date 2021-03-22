package com.collection.queue;

import java.util.PriorityQueue;

import com.collection.treeset.MyStringBufferComparator;

public class PriorityQueueDemo2 {
	public static void main(String[] args) {
		MyStringBufferComparator mycom=new MyStringBufferComparator();
		PriorityQueue<Integer>queue=new PriorityQueue<>();
		queue.add(50);
		queue.offer(60);
		queue.add(40);
		queue.offer(30);
		queue.add(20);
		queue.offer(10);
		System.out.println(queue);
System.out.println(queue.element());
System.out.println(queue.peek());

System.out.println(queue.poll());//it returns null when there is no elements
System.out.println(queue.remove());

		System.out.println(queue);

}}
