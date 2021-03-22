package com.constructor.oops;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1=new Circle(2.5f,"black");
		Circle c2=new Circle(2.0f,"blue");
		Circle c3=new Circle(1.0f,"red");
		System.out.println("radius="+c1.getRadius());
		System.out.println("area="+c1.getArea());
		
		System.out.println("radius="+c2.getRadius());
		System.out.println("area="+c2.getColor());
		
		System.out.println("radius="+c1.getRadius());
		System.out.println("area="+c2.getArea());
		
		
		
	}

}
