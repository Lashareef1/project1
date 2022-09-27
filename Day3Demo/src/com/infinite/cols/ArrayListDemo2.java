package com.infinite.cols;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1,"La",95885));
		employList.add(new Employ(2, "vijay", 85582));
		employList.add(new Employ(3, "madheen", 84562));
		System.out.println("name are");
		for (Object e1 : employList) {
			Employ employ =(Employ)e1;
			System.out.println(employ);
		}
	}

}
