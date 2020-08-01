package com.passion2code.demo;

public class Demo {

	public static void main(String args[]) {
		String s = "demystify";
		char[] c = s.toCharArray();
		int count = 0;

		System.out.println("Before: " + count);

		for (int i = 0; i < c.length; i++) {
			count += (int) c[i];
		}

		System.out.println("After: " + count);
		System.out.println("index: " + count % 10);
	}
}
