package day1302file;

import java.io.File;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("�����ļ���");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);// file�����װ·��s
		if (!dir.isDirectory()) {// ��������ļ���
			System.out.println("����Ĳ����ļ���");
			return;
		}
		// ���Ŀ¼�б�
		String[] names = dir.list();
		File[] files = dir.listFiles();

		if (names == null) {
			// �ļ�·���������޷� ����Ŀ¼
			// ���������ĺ�Null
			System.out.println("���ܻ���б�");
			return;
		}

		long size = dirLength(dir);
		System.out.println(size / 1024 / 1024 + "MB");

	}

	private static long dirLength(File dir) {
		// ��dir�ļ����б�
		File[] files = dir.listFiles();
		if (files == null) {// �б�ʧ�ܣ��������ܴ�С
			return 0;
		}
		long sum = 0;// ��׼��һ���ۼӱ���
		for (File f : files) {// �����������ļ���Ŀ¼
			if (f.isFile()) {// f���ļ�
				sum += f.length();// �ۼ��ļ���С
			} else {// f���ļ���
				sum += dirLength(f);// �ݹ飬��f�ļ��е��ܴ�С���ۼӵ�sum
			}
		}
		return sum;

	}

}
