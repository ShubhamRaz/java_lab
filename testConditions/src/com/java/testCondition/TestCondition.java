package com.java.testCondition;
import java.util.Scanner;
public class TestCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int srange = sc.nextInt();
		int erange = sc.nextInt();
		
		int c = 0;
		
		for(int i = srange;i<=erange;i++){
			if(i%3==0)
			c++;
		}
		System.out.println("/ by 3: "+c);
		
		c = 0;
		
		for(int i = srange;i<=erange;i++){
			if(i%4==0) 
			c++;
			
		}
		System.out.println("/ by 4: "+c);
		c = 0;
		
		for(int i = srange;i<=erange;i++){
			if(i%5==0)
			c++;
		}
		System.out.println("/ by 5: "+c);
		c = 0;
		

	}

}
