package day1204�쳣;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Text2 {
	/*
	 * �����ļ�·����d:/wfwf.txt
	 * ��ʾ�ļ��Ѿ�������d:/wfwf.txt
	 * 
	 */
	public static void main(String[] args) {
		 try {
			f1();
		} catch (IOException e) {
			System.out.println("�޷������ļ�");
			e.printStackTrace();
		}
		
	}

	private static void f1() throws IOException {
		System.out.println("�����ļ�·����");
		String path = new Scanner(System.in).nextLine();
		File f = new File(path);
		f.createNewFile();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
