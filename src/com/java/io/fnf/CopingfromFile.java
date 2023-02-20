package com.java.io.fnf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopingfromFile {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(":\\Eclipseworkspace\\Java\\ExceptionHandling\\src\\com\\java\\io\\fnf\\a.txt");
			fos = new FileOutputStream("D:\\Eclipseworkspace\\Java\\ExceptionHandling\\src\\com\\java\\io\\fnf\\b.txt");

			System.out.println("File Read Successfully !!");

		} catch (FileNotFoundException e) {
			System.out.println("Hi Yor File is Not available on this locaiton" + e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
