package com.infinite.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import com.infinite.cols.Employ;

public class SortEmploy {

	public static void main(String[] args) {
		Comparator<Employ> c = NameComparator();
		SortedSet<Employ> employList = new TreeSet<Employ>(c);
		employList.add(new Employ(1,"La",95845));
		employList.add(new Employ(2, "vijay", 85582));
		employList.add(new Employ(3, "madheen", 84462));
		for (Object obj : employList) {
			Employ employ =(Employ)obj;
			System.out.println(employ);
		}

	}

	

}
