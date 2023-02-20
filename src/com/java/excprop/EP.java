package com.java.excprop;

public class EP {
	
	public void m() {
		System.out.println("m method called");
		try {
			int aa =100;
			int bb = 0;
			int cc = aa/bb;
		}catch (ArithmeticException e) {
			System.out.println("m method ArithematicException");
		}
		
	}

	public void m2() {
		System.out.println("m2 method called");
		m();
	}

	public void m3() {
		System.out.println("m3 mehtod called");
		try {
			System.out.println("before m2 method called");
			m2();
			System.out.println("after m2 method called.");
			int aa =200;
			int bb = 0;
			int cc = aa/bb;

		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

}
