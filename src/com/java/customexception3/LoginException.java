package com.java.customexception3;

public class LoginException extends Exception {
	public LoginException(String s) {
		System.out.println(s);
	}
}
