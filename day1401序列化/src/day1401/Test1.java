package day1401;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		/*
		 * ��ѧ��ʵ�����л� ���浽�ļ�f2
		 *
		 * f2�ļ��ϲ�һ���ļ�����������ļ������(FOS)���ٲ�һ�����л��������(OOS)
		 * 
		 * OOS--FOS--f2
		 */
		Student stu = new Student(9527, "�Ʋ���", "��", 19);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("g:/abc/f2"));
		out.writeObject(stu);
		out.close();

	}

}
