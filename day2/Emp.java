package com.infinite.day2;

public class Emp {
	int empno;
	String name;
	double basic;
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	public Emp(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
