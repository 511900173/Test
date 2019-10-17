package day1303�ļ���;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("�����ļ�");
		String s = new Scanner(System.in).nextLine();
		File file = new File(s);
		if (!file.isFile()) {
			System.out.println("����Ĳ����ļ�");
			return;
		}
		System.out.println("KEY:");
		int key = new Scanner(System.in).nextInt();
		try {
			/*
			 * ���ܽ��ܸ�ֵ
			 * "a.jpg" --> "a.jpg.74361564743156"
			 */
			encryptCopy(file, key);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
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
