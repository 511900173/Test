package com.tedu.oop;

//�yԇ����̈́�������
public class Text3_NewClass {
	public static void main(String[] args) {
		// �����������,ͨ��new�ؼ���;
		// ���p���������ͣ�������person����ĵ�ֵַ
		Person p = new Person();//�մ��������Ķ������Ծ���Ĭ��ֵ
		// �޸����Ե�����
		p.name = "�ܴ�";
		p.gender = "��";
		p.age = 20;
		System.out.println(p.name);
		System.out.println(p.gender);
		System.out.println(p.age);
		// ���ö���ķ���+-
		p.eat();
		p.sleep();
	}
}

//��һ��Java�ļ��п��Դ��ڶ��class��
//������һ��class��public����
//�����ļ��������public������һ��

//ͨ��class�ؼ��ֶ�����(һ������ĳ���)
class Person {
	// ����(��Ա����) + ��Ϊ(��Ա����)
	String name;
	String gender;
	int age;
	// ��Ϊ(��Ա����)
	public void eat() {
		System.out.println("�Է���");
	}
	public void sleep() {
		System.out.println("˯����");
	}
}