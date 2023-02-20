package com.java.eh;

public class Test {

	public static void main(String[] args) {

		try {
			int c = 10 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
