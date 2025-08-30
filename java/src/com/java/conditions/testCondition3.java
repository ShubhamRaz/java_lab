package com.java.conditions;
import java.util.*;
public class testCondition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range: ");
		int srange = sc.nextInt();
		int erange = sc.nextInt();
		System.out.print("Enter total numbers: ");
		int choice = sc.nextInt();
		for(int i = 0;i<choice;i++) {
			System.out.print("Enter num "+(i+1)+" : " );
				int num = sc.nextInt();
				int c = 0;
				for(int j = srange;j<=erange;j++) {
					if(j%num==0) c++;
				}
				System.out.println("Devide by "+num+": "+c);
				c = 0;
		}
	}

}
