package com.java.ep;

import java.io.IOException;

public class Simple {
	void m() throws IOException {
		System.out.println("M");
		throw new IOException("device error");
	}

	void n() throws IOException {
		System.out.println("NN");
		m();
	}

	void p() {
		System.out.println("P");
		try {
			System.out.println("N");
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		Simple obj = new Simple();
		obj.p();
		System.out.println("normal flow...");
	}
}