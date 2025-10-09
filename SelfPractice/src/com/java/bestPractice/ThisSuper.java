package com.java.bestPractice;
class Shape{
	int price;
	
	public Shape(int price) {
		this.price = price;
	}
	
	public void print() {
		System.out.println("Price %d".formatted(price));
	}
}

class Square extends Shape{
	int length;
	int breadth;
	
	public Square(int length,int breadth) {
		this(10,length,breadth);
	}
	public Square(int price,int length,int breadth) {
		super(price);
		this.length = length;
		this.breadth = breadth;
	}
	
	public void print2() {
		this.print();
		System.out.println("Length %d".formatted(length));
		System.out.println("Breadth %d".formatted(breadth));
	}
	
	
}
public class ThisSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square(5,6);
		sq.print2();

	}

}
