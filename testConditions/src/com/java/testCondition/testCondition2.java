package com.java.testCondition;
import java.util.*;
public class testCondition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range: ");
		int srange = sc.nextInt();
		int erange = sc.nextInt();
		
		System.out.print("Enter total numbers: ");
		int choice = sc.nextInt();
		int[] arr = new int[choice];
		
		for(int i = 0;i<choice;i++) {
			System.out.print("Enter num "+(i+1)+" : " );
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<choice;i++) {
			int c = 0;
			for(int j = srange;j<=erange;j++) {
				if(j%arr[i]==0) c++;
			}
			System.out.println("Devide by "+arr[i]+": "+c);
			c = 0;
		}

	}

}
