package com.java.inheritance;

class Animal{
	String name;
	String breed;
	int age;
	
	void bark() {
		System.out.println("dog is barking");
	}
	void walk() {
		System.out.println("dog is walking");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println(name + " is barking");
	}
	void walk() {
		System.out.println(name+" is walking");
	}
}
public class animalTest {
	public static void main(String[] args) {
		Dog Tommy = new Dog();
		Tommy.name = "tommy";
		Tommy.breed = "bull dog";
		Tommy.age = 13;
		
		Tommy.bark();
		Tommy.walk();
	}
	
}
