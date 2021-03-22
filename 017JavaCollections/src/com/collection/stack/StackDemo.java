package com.collection.stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();
		//lifo (last in first out
		stack.push(5);//4
		stack.push(6);//3
		stack.push(2);//2
		stack.push(8);//1
		stack.push(4);
		System.out.println("is empty: " + stack.empty());
		System.out.println(stack);
		System.out.println(stack.peek());//top object from the stack
		System.out.println(stack.pop());// removes top object from the stack and returns
		System.out.println(stack);
		System.out.println(stack.search(2));
		System.out.println(stack.search(5));
		

	}

	}


