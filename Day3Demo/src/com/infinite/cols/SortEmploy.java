package com.infinite.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		Comparator c = new NameComparator();
		SortedSet employList = new TreeSet(c);
		employList.add(new Employ(1,"La",95845));
		employList.add(new Employ(2, "vijay", 85582));
		employList.add(new Employ(3, "madheen", 84462));
		for (Object obj : employList) {
			Employ employ =(Employ)obj;
			System.out.println(employ);
	}

}
}
