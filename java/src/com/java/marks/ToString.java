package com.java.marks;
class Student{
	String name;
	int m1,m2,m3,m4,m5;
	public Student(String name, int m1, int m2, int m3, int m4, int m5) {
		super();
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getM4() {
		return m4;
	}
	public void setM4(int m4) {
		this.m4 = m4;
	}
	public int getM5() {
		return m5;
	}
	public void setM5(int m5) {
		this.m5 = m5;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + ", m5=" + m5 + "]";
	}
	
}
public class ToString {
	public static void main(String[] args) {
		Student s1 = new Student("Shubham",85,95,74,89,87);
		Student s2 = new Student("Kavya",99,98,86,98,100);
		Student s3 = new Student("Jivesh",85,86,98,75,84);
		Student s4 = new Student("Aryan",85,95,74,79,88);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
