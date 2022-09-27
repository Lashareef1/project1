package com.infinite.day2;

public class EmpArray {

	public static void main(String[] args) {
		Emp[] arr=new Emp[] {
				new Emp(1, "Sai Kamala",84382),
				new Emp(2, "Kishor",84352),
				new Emp(3, "Madhenu",84582),
				new Emp(4, "Lashareef",88482),
				
		};
		for (Emp emp : arr) {
			System.out.println(emp);
		}

	}

}
