package com.collection.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlokingQueueDemo {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer>bq=new PriorityBlockingQueue<>(10);
	//	bq.add(null);
		bq.add(10);
		bq.add(16);
		bq.put(23);
		bq.add(45);
		bq.put(12);
		bq.add(10);
		bq.add(16);
		System.out.println(bq);
		bq.offer(345, 5, TimeUnit.SECONDS);
	//	System.out.println(bq.take());
		
	}

}
