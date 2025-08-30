package com.java.arrays;
import java.util.Scanner;
public class TestClassArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		String name[]  = new String[5];
		
		System.out.println("Enter Array");
		for(int i = 0;i<3;i++) {
			a[i] = sc.nextInt();
			name[i] = sc.next();
		}
		
		System.out.println("Enter name of your choice");
		String choice = sc.next();
		for(int i = 0;i<3;i++) {
			if(name[i].equals(choice)) System.out.println("Id: "+a[i]);
		}
	}
}
