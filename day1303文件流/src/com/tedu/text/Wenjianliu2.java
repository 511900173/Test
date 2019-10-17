package com.tedu.text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Wenjianliu2 {

	public static void main(String[] args) throws Exception {
		FileInputStream inputStream = new FileInputStream("G:/abc/f1");
		int b;
		while ((b=inputStream.read())!=-1) {
			System.out.println(b);
		}
	}

}
