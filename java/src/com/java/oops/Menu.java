package com.java.oops;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Override-->1");
		System.out.println("Overload-->2");
		System.out.print("Enter Choice: ");
		int x = sc.nextInt();
		int a,b;
		
		
		Child child = new Child();
		
		switch(x) {
		case 1:
			System.out.print("Enter a: ");
			a = sc.nextInt();
			System.out.print("Enter b: ");
			b = sc.nextInt();
			child.add(a, b);
			
			break;
			
		case 2:
			System.out.print("Enter a: ");
			a = sc.nextInt();
			System.out.print("Enter b: ");
			b = sc.nextInt();
			child.add((float)a,(float) b);
			break;
			
		default:
			System.out.println("Wrong choice");
			if(x != 0) {
				Menu.main(args);
			}
			
			
		}

	}
}
