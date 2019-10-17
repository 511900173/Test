package com.tedu.text;

import java.io.File;
import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		System.out.println("输入文件夹");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if (!dir.isDirectory()) {
			System.out.println("输入的不是文件夹");
			return;
		}
		long size = dirLength(dir);
		System.out.println(size);

	}

	private static long dirLength(File dir) {

		File[] files = dir.listFiles();
		if (files == null) {
			return 0;
		}
		long sum = 0;
		for (File q : files) {
			if (q.isFile()) {
				sum += q.length();
			} else {
				sum += dirLength(q);
			}
		}
		return sum;

	}

}
