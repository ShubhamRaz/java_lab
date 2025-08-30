package com.java.arrays;
import java.util.Scanner;

class FindSum{
	public static int Sum(int num) {
		int sum = 0;
		while(num>0) {
			sum = sum + num%10;
			num = num/10;
		}
		
		return sum;
	}
}
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		System.out.println("Sum: "+FindSum.Sum(num));
		

	}

}
