package com.infinite.cols;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
 

public class SetDemo {

	public static void main(String[] args) {
		Set names = new   LinkedHashSet();
		names.add("Bhargavi");
		names.add("La");
		names.add("vijay");
		names.add("Bhargavi");
		names.add("La");
		names.add("vijay");
		names.add("Bhargavi");
		names.add("La");
		names.add("vijay");
		for (Object ob : names) {
			System.out.println(ob);
			
		}

	}

}
