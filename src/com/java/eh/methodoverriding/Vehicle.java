package com.java.eh.methodoverriding;

public class Vehicle {
	public void start() {		
		int a = 100;
		int b = 0;
		int c = a/b;
		System.out.println(c);
	}
	
	public void run() {
		System.out.println("Vehicle-run");
	}

}
