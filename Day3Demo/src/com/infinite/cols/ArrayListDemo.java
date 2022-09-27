package com.infinite.cols;

import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayListDemo names = new ArrayListDemo();
	names.add("Kishore");
	names.add("Siresha");
	names.add("hari");
	names.add("sachin");
	names.add("la");
	System.out.println("Names are  ");
	for (Object ob : names) {
		System.out.println(ob);
	}

	}

}
