package com.java.npe;

public class Student {
	int id;
	String name;
	String address;

	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void strudentInformation() {
		System.out.println("Id :" + id + "	Name:" + name + "	Addess:" + address);
	}
}
