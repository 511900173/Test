package com.tedu.oop;
//���Ծ�̬��Դ�ͷǾ�̬��Դ֮��ĵ��ù�ϵ
public class Text5_Static {

	public static void main(String[] args) {
		
	}	
}

//��������
class Person{
	// 1,��̬��Դֻ�ܵ��þ�̬��Դ
	// 2,�Ǿ�̬��Դ���ܵ���
	static String name;
	int age;
	static public void eat() {
		//��̬���������÷Ǿ�̬����
		//System.out.println(age);
		System.out.println(1);
	}
	
	public void sleep() {
		//�Ǿ�̬��Դ�ܵ��þ�̬��Դ�ͷǾ�̬��Դ
		System.out.println(name);
		System.out.println(age);
		System.out.println(2);
	}
}

