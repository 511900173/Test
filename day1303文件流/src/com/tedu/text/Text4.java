package com.tedu.text;

import java.io.File;
import java.util.Scanner;

public class Text4 {
	public static void main(String[] args) {
		System.out.println("输入文件夹");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if (!dir.isDirectory()) {
			System.out.println("输入的不是文件夹");
		}
		long size = dirLength(dir);
		System.out.println(size);
	}

	private static long dirLength(File dir) {
		File[] ss = dir.listFiles();
		if (ss==null) {
			return 0;
		}
		long sum=0;
		for (File ww : ss) {
			if (ww.isFile()) {
				sum+=ww.length();
			}else {
				sum+=dirLength(ww);
			}
		}
		
		return sum;
	}
}
