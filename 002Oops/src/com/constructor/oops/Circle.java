package com.constructor.oops;

public class Circle {
	private float radius;
	private String color;
	public Circle() {
		
	}

public Circle (float radius,String color) {
	this.radius=radius;
	this.color=color;
}

	public float getRadius() {
		return radius;
		
	}
	public String getColor() {
		return color;
		
	}
	public float getArea() {
		float area=3.14f*radius*radius;
		return area;
	}
	
}
