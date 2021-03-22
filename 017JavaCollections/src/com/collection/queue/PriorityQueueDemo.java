package com.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String>queue=new PriorityQueue<>();
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
//		queue.add("Praveen");  
//		queue.add("Ramesh");
		System.out.println("elements in the queue:"+queue);
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek()); 
		queue.remove();
		queue.poll();
		System.out.println("elements in the queue:"+queue);


	}

}
