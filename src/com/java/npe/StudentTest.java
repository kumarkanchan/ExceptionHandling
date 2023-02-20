package com.java.npe;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student(111, null, null);

		try {
			System.out.println(s.id);
		} catch (NullPointerException e) {
			System.out.println("MISSING ID");
		}

		try {
			System.out.println("NAME : " + s.name.charAt(2));

		} catch (NullPointerException ee) {
			System.out.println("MISSING NAME");
		}

		try {
			System.out.println(s.address.charAt(3));
		} catch (NullPointerException eee) {
			System.out.println("MISSING ADDRESS");
		}

	}

}
