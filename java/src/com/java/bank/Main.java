package com.java.bank;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(1,1000,"Shubham",54621);
		Account a2 = new Account(2,1001,"Kavya",99999999);
		Account a3 = new Account(3,1002,"Jivesh",598456);
		Account a4 = new Account(4,1003,"Vivek",355678);
		Account a5 = new Account(5,1004,"Aryan",8654534);
		
		ArrayList<Account> list = new ArrayList<>();
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		double max = 0;
		String name="";
		for(Account x:list) {
			if(x.getBalance()>max) {
				max = x.getBalance();
				name = x.getName();
			}
		}
		
		System.out.println("Name: %s".formatted(name));
		System.out.println("Max balance: %f".formatted(max));
		

	}

}
