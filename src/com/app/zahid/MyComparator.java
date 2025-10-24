package com.app.zahid;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(T o1, T o2) {
		String s1=o1.ToString();
		String s2=o1.ToString();

		return s2.compareTo(s1);
	}

}
