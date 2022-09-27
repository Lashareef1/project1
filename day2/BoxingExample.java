package com.infinite.day2;

public class BoxingExample {

	public static void main(String[] args) {
		int a=12;
		String str="Hello";
		double sal=52343.32;
		
		Object obj1=a;
		Object obj2=str;
		Object obj3=sal;
		
	int a1=(Integer)obj1;
	String s1=(String)obj2;
	double b1=(Double)obj3;
	
	System.out.println(a1);
	System.out.println(s1);
	System.out.println(b1);
	}

}
