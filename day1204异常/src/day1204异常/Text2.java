package day1204异常;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Text2 {
	/*
	 * 输入文件路径：d:/wfwf.txt
	 * 提示文件已经创建：d:/wfwf.txt
	 * 
	 */
	public static void main(String[] args) {
		 try {
			f1();
		} catch (IOException e) {
			System.out.println("无法创建文件");
			e.printStackTrace();
		}
		
	}

	private static void f1() throws IOException {
		System.out.println("输入文件路径：");
		String path = new Scanner(System.in).nextLine();
		File f = new File(path);
		f.createNewFile();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
