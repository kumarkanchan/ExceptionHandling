package com.java.customexception3;

public class WithdrawException extends Exception {
	public WithdrawException(String s) {
		System.out.println(s);
	}
}
