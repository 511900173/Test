package day1302file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * �½��ļ��У�d:/abc/aa/bb/
 * �½��ļ���    d:/abc/aa/bb/f1
 * ɾ��f1�ļ�
 * ɾ��bb�ļ���
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		System.out.println("���س�ִ��");
		
//		new Scanner(System.in).nextLine();
//		File dirFile = new File("G:/abc/aa/bb/");
//		dirFile.mkdirs();
		
//		new Scanner(System.in).nextLine();
		
//		for (int i = 0; i < 10000; i++) {
//			File f = new File(dirFile,"f1"+i+".png");
//			f.createNewFile();
//		}
		File f = new File("C:/Users/Administrator/Desktop/Adobe Photoshop CC (64 Bit)/Adobe Photoshop CC (64 Bit)/Adobe Photoshop CC (64 Bit)/Required/a.txt");
		
		new Scanner(System.in).nextLine();
		f.delete();
		
//		new Scanner(System.in).nextLine();
//		dirFile.delete();

	}
}
