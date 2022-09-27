package com.infinite.day2;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sno=1;
		s1.name="sirisha";
		s1.city="bnglr";
		s1.cgp=8.0;
		
		Student s2 =  new Student();
		s2.sno=2;
		s2.name="yaswanth";
		s2.city="hyd";
		s2.cgp=8.2;
		
		Student s3 =  new Student();
		s3.sno=3;
		s3.name="La";
		s3.city="vizag";
		s3.cgp=9.5;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
