package com.java.testString;
import java.util.Scanner;
public class TestString {
	
	public static int findNum(String s[]) {
		int len = s.length;
		int result = 0;
		String arr[] = {"1","2","3","4","5","6","7","8","9","0"}; 
		for(int i = 0; i<len; i++) {
			
			for(int j = 0;j<10;j++) {
				if(s[i].equals(arr[j])) result = Integer.parseInt(s[i]);
			}
			
			
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name Size: ");
		int nameSize = sc.nextInt();
		System.out.println("Enter Name");
		String a[] = new String[nameSize];
		for(int i = 0; i<nameSize; i++) {
			a[i] = sc.next();
		}
		
		
		System.out.print("Enter surName Size: ");
		int surnameSize = sc.nextInt();
		
		String b[] = new String[surnameSize];
		System.out.println("Enter Surname");
		for(int i = 0; i<surnameSize; i++) {
			b[i] = sc.next();
		}
		
		int num1 = findNum(a);
		int num2 = findNum(b);
		
		System.out.println("Sum: "+num1+ " + "+ num2 +" = "+(num1+num2));
		
		
		

	}

}
