package com.infinite.day2;

public class StrExample {
	
	public void show() {
		String str="Welcome to Java Programming... Training Prasanna...";
		System.out.println("Length of Sting is "+str.length());
		System.out.println("First Occurance of char 'o' is "+str.indexOf('o'));
		System.out.println("Char at 5th position "+str.charAt(5));
		System.out.println("Lower Case "+str.toLowerCase());
		System.out.println("Upper Case "+str.toUpperCase());
		String s1="la", s2="mahendra",s3="vijay";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

	public static void main(String[] args) {
		StrExample obj = new StrExample();
		obj.show();

	}

}
