package com.tedu.text;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Wenjianliu1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream outputStream = new FileOutputStream("G:/abc/f1");
		outputStream.write(44);
		outputStream.write(45);
		outputStream.write(46);
		outputStream.write(47);
		
		byte[] a = {123,11,115,13,125,13,16,41};
		outputStream.write(a,0,7);
		outputStream.write(a,3,3);
		outputStream.close();

	}

}
