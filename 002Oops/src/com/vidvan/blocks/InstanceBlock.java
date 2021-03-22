package com.vidvan.blocks;

public class InstanceBlock {
	{
		System.out.println("instance block");
	}

	public InstanceBlock() {
		System.out.println("constructor called");
	}

	public static void main(String[] args) {
		InstanceBlock ib = new InstanceBlock();

	}

}
