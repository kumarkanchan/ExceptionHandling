package com.java.throwss;

import java.io.IOException;

public class Student {
	public void speek() throws IOException, Exception{
		try {
			throw new Exception();
			
		} catch (Exception e) {
			System.out.println("Hii, Neeraj have speek problem, he use to speek less");
		}
	}

	public static void main(String[] args) throws IOException {
		Student s = new Student();
		

	}

}
