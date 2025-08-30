package com.java.arrays;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range: ");
		int srange = sc.nextInt();
		int erange = sc.nextInt();
		sc.close();
		
		int prime[] = new int[(erange-srange)/2];
		int idx = 0;		
		for(int i = srange;i<=erange;i++) {
			int flag = 0;
			for(int j = 2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag = 1;
					break;
					
				}
			}
			if(flag == 0) {
				prime[idx] = i;
				idx++;
			}
			
		}
		
		System.out.println("Prime numbers: ");
		for(int i = 0;i<idx;i++)
		System.out.println(prime[i]);
	}
		

}
