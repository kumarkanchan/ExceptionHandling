package com.java.customexception;

public class Age {
	public void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Hi, You are Not valid voter");
		} else {
			System.out.println("Yes, come and caste your vote");
		}
	}

}
