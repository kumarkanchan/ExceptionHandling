package com.java.ep;

public class EP {
	
	void m1() throws M1Exception{
		System.out.println("Exception Area.");
		int a = 50 / 0;
	}

	void m2() throws M1Exception {
		System.out.println("m1");
		m1();
	}

	void m3() {
		System.out.println("m3.");
		try {
			System.out.println("m2");
			m2();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}

}
