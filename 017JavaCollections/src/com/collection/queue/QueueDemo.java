package com.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String>q=new LinkedList<String>();
		q.add("Amit");  
		q.add("Vijay");  
		q.add("Karan");  
		q.add("Jai");  
		q.add("Rahul"); 
	      System.out.println("Elements in Queue:"+q);
//	      System.out.println("peek(): "+q.peek());//returns head of elements
//	      System.out.println("head Element in Queue:"+q.element());

	      q.remove();//removes first element from the queue
	      System.out.println("Elements in Queue:"+q);
	      
	     
	      
//q. poll() :it removes and returns the head element
System.out.println("poll(): "+q.poll());
System.out.println("Elements in Queue:"+q);

	}

}
