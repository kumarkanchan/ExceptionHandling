package com.java.customexception3;

public class CheckBalanceException extends Exception {
	public CheckBalanceException(String s) {
		System.out.println(s);
	}
}
