package com.tedu.constructor;
//���Թ��췽����ֵ
public class Text2_Constructor {
	public static void main(String[] args) {
		//
		//��"С��"����n 18����a
		Student s = new Student("С��", 18);
		System.out.println(s.name);
		System.out.println(s.age);
	}
}
class Student {
	String name;
	int age;
	// ��ֵ��ʽ1������set();
	public Student() {
	} // ����new Student()��������
	// ��ֵ��ʽ2�����ù��캯��;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
