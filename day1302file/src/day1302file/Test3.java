package day1302file;

import java.io.File;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("输入文件夹");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);//file对象封装路径s
		if (!dir.isDirectory()) {//如果不是文件夹
			System.out.println("输入的不是文件夹");
			return;
		}
		//获得目录列表
		String[] names = dir.list();
		File[] files = dir.listFiles();

		if (names == null) {
			// 文件路径不存在无法 进入目录
			//三种情况会的好Null
			System.out.println("不能获得列表");
			return;
		}
		for (String name : names) {
			System.out.println(name);
		}
		for (File file : files) {
			System.out.println(file.getName() + "---" + file.length());
		}

	}
}
