package com.tedu.oop;

public class Text4_Static {
	public static void main(String[] args) {
		// 1����̬��Դ�����ڶ������(û��������Ҳ���þ�̬��)
		// 4������ֱ�ӱ���������
		Student.name = "С��";
		System.out.println(Student.name);
		// 3��ֻ����һ��
		Student s = new Student();
		Student s2 = new Student();
		// ���ֻ����һ��Ӧ���ڴ��ַ��һ��
		// ͨ��==�ж���������ĵ�ֵַ�Ƿ���ͬ
		// �õ�true˵���ڴ���ֻ��һ�ݾ�̬��Դname
		// ��s.name��ֵ��s2.name��ֵ��s.nameһ�� ˵��������һ��name
		s.name = "jfdkjlfs";
		System.out.println(s2.name);
		
	}
}
//������
class Student {
	// ��staitc�ؼ��ְ����Ա�ɾ�̬��
	static String name;
	int age;

	public void eat() {
		System.out.println("�Է�");
	}

	// ��̬����
	public static void sleep() {
		System.out.println("˯��");
	}
}