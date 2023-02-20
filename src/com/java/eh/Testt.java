package com.java.eh;

public class Testt {

	public static void main(String[] args) {
		// NP Exception - occurs when we are not providing value for a string or obj.

		try {
			String s = "Rama";
			if (s != null) {
				System.out.println(s.charAt(2));
			} else {
				System.out.println("Please Enter some string value in stirng obj");
			}

		} catch (NullPointerException ee) {
			System.out.println("NPE");
		}

		catch (Exception e) {
			System.out.println("Logically Not Good.");
		} finally {
			System.out.println("It executes always");
		}

	}
}
