package com.java.customexception3;

public class DepositeException extends Exception {
	public DepositeException(String s) {
		System.out.println(s);
	}
}
