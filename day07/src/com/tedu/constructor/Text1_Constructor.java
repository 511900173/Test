package com.tedu.constructor;
//���Թ��췽��
public class Text1_Constructor {
	public static void main(String[] args) {
		// ����Person����
		// ��ִ��new Person() ʱ���Զ����ù��췽��
		Person p = new Person();
		// ����ʾ���ṩ�˺��ι���ʱ�� �޲�������ᱻ����
		// ��ʱ������ʾ���ṩ�o�ι���
		Person p1 = new Person(18);
		Person p2 = new Person("С��");
	}
}
//��������
class Person {
	// ���췽�� :������������һ�� ���η� ������ ([����..]) {}
	// ����1�������������� ����2����ʼ������
	public Person() { // ���ṩ�˺��ι���ʱ������џo�ι�����ʾ��д����
		int age = 007;
		System.out.println(age);
	}
	public Person(int a) {
		System.out.println(a);
	}
	public Person(String a) {
		System.out.println(a);
	}
}
