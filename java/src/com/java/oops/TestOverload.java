package com.java.oops;
class Parent{
	
	public void add(int a,int b) {
		System.out.print("Parent called: ");
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	
	public void add(double a,double b) {
		System.out.print("Parent called: ");
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	
}

class Child extends Parent{
	public void add(int a,int b) {
		System.out.print("Child called: ");
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	
}



public class TestOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent parent = new Parent();
		parent.add(5, 5);
		parent.add(5.0,5.0);
		
		Child child = new Child();
		child.add(5,5);
		child.add(5.0,5.0);
		

	}

}
