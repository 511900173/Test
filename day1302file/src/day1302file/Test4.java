package day1302file;

import java.io.File;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("输入文件夹");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);// file对象封装路径s
		if (!dir.isDirectory()) {// 如果不是文件夹
			System.out.println("输入的不是文件夹");
			return;
		}
		// 获得目录列表
		String[] names = dir.list();
		File[] files = dir.listFiles();

		if (names == null) {
			// 文件路径不存在无法 进入目录
			// 三种情况会的好Null
			System.out.println("不能获得列表");
			return;
		}

		long size = dirLength(dir);
		System.out.println(size / 1024 / 1024 + "MB");

	}

	private static long dirLength(File dir) {
		// 对dir文件夹列表
		File[] files = dir.listFiles();
		if (files == null) {// 列表失败，不能求总大小
			return 0;
		}
		long sum = 0;// 先准备一个累加变量
		for (File f : files) {// 遍历所有子文件子目录
			if (f.isFile()) {// f是文件
				sum += f.length();// 累加文件大小
			} else {// f是文件夹
				sum += dirLength(f);// 递归，求f文件夹的总大小并累加到sum
			}
		}
		return sum;

	}

}
