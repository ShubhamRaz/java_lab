package com.java.arrays;

class ArrayClass{
	ArrayClass(int a[]){
		for(int i = 0;i<5;i++) a[i] = i+1;
		
		for(int i = 0;i<5;i++) System.out.print(a[i]+" ");
	}
}
public class ArrayInsideConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		new ArrayClass(arr);

	}

}
