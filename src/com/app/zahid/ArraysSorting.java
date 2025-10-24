package com.app.zahid;

import java.util.Arrays;

public class ArraysSorting {

	public static void main(String[] args) {

		int a[] = { 10, 5, 20, 11, 6 };
		System.out.println("primetive array before sorting");

		for (int a1 : a) {
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("primetive arrays after sorting");

		for (int a1 : a) {
			System.out.println(a1);

		}
		String[] s = { "a", "z", "b" };
		System.out.println("object array before sorting");
        System.out.println("object array before sorting");

		for (String a2 : s) {
			System.out.println(a2);

		}
		Arrays.sort(s);
		System.out.println("object array after sorting");
        System.out.println("hello")

		for (String a3 : s) {
			System.out.println(a3);
		}

	}
}
