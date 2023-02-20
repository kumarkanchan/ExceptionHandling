package com.java.aiofbe;

public class Student {

	public static void main(String[] args) {
		int a[] = { 9, 8, 7 };
		String s = "Ram";
		try {
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(s.charAt(9));
		} catch (StringIndexOutOfBoundsException ee) {
			ee.printStackTrace();;
		}
	}

}
