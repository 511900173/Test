package day1303文件流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("输入文件");
		String s = new Scanner(System.in).nextLine();
		File file = new File(s);
		if (!file.isFile()) {
			System.out.println("输入的不是文件");
			return;
		}
		System.out.println("KEY:");
		int key = new Scanner(System.in).nextInt();
		try {
			/*
			 * 加密解密赋值
			 * "a.jpg" --> "a.jpg.74361564743156"
			 */
			encryptCopy(file, key);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
	}
	private static void encryptCopy(File file, int key) throws Exception {
		File to = new File(file.getParentFile(), file.getName() + "." + System.currentTimeMillis());
		//FIS--file
		//FOS--to
		FileInputStream in = new FileInputStream(file);
		FileOutputStream out = new FileOutputStream(to);
		
//		int b;
//		while ((b=in.read())!=-1) {
//			b^=key;
//			out.write(b);
//		}
		
		byte[] buff = new byte[8192];
		int n;
		while ((n=in.read(buff))!=-1) {
			for (int i = 0; i < n; i++) {
				buff[i]^=0xa3;
			}
			out.write(buff,0,n);
		}
		
		
		
		
		in.close();
		out.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
