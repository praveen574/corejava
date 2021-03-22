package com.runtimepolymorphism;

public class Test {
public static void main(String[] args) {
	Bike b=new Splendor();
	b.run();
	
	Animal a=new Dog();
	Animal a1=new Cat();
	Animal a2=new BabyDog();
	a.eat();
	a.run();
	a1.eat();
	a1.run();
	a2.eat();
	a2.run();
}
}
