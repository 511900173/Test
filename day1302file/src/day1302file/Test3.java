package day1302file;

import java.io.File;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("�����ļ���");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);//file�����װ·��s
		if (!dir.isDirectory()) {//��������ļ���
			System.out.println("����Ĳ����ļ���");
			return;
		}
		//���Ŀ¼�б�
		String[] names = dir.list();
		File[] files = dir.listFiles();

		if (names == null) {
			// �ļ�·���������޷� ����Ŀ¼
			//���������ĺ�Null
			System.out.println("���ܻ���б�");
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
