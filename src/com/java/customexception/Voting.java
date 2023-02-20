package com.java.customexception;

public class Voting {

	public static void main(String[] args) throws InvalidAgeException {
		Age a = new Age();
		a.validateAge(18);
		
	}
}
