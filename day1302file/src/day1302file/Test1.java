package day1302file;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;
		path = "E:/eclipse/eclipse.exe";//���ڵ��ļ�
//.
		path = "E:/eclipse/p2";//���ڵ��ļ�
//		path = "H:/eclipse/p2";//���ڵ��ļ���
		File f = new File(path);//·���ַ�����װ��File��ʵ��
		
		System.out.println(f.getName());//�ļ���
		System.out.println(f.getParent());//��Ŀ¼
		System.out.println(f.getAbsolutePath());//����·��
		System.out.println(f.length());//�ֽ������ļ�����Ч
		System.out.println(f.exists());//�Ƿ����
		System.out.println(f.isFile());//�Ƿ����ļ�
		System.out.println(f.isDirectory());//�Ƿ����ļ���
		
	}
}
