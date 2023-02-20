package com.java.eh.methodoverriding;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Bike extends Vehicle {
	public void start() throws ArithmeticException {
		System.out.println("Bike-Start");
	}

	public void run() {
		System.out.println("Bike-run");
	}

}
