package com.tedu.text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Wenjianliu3 {
	public static void main(String[] args) {
		System.out.println("输入文件夹");
		String s = new Scanner(System.in).nextLine();
		File file = new File(s);
		if (!file.isDirectory()) {
			System.out.println("输入的不是文件夹");
		}
		System.out.println("key:");
		int key = new Scanner(System.in).nextInt();
		try {
			encryptCopy(file,key);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
	}

	private static void encryptCopy(File file, int key) throws Exception {
		File to = new File(file.getParent(), file.getName()+"."+System.currentTimeMillis());
		FileInputStream in = new FileInputStream(file);
		FileOutputStream out = new FileOutputStream(to);
//		int b;
//		while ((b=in.read())!=-1) {
//			b^=key;
//			out.write(b);
//		}
		
		
		
		
		in.close();
		out.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
