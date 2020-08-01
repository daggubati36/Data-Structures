package com.passion2code.demo;

public class Demo {

	public static void main(String args[]) {
		String str = "Phani";
		char[] d = str.toCharArray();
		int count = 0;

		for (int i = 0; i < d.length; i++) {
			count += (int) d[i];
		}

		System.out.println(count % 20);
	}
}
