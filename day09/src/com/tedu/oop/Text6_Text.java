package com.tedu.oop;

public class Text6_Text {

	public static void main(String[] args) {
		Teacher t1 = new PeiTeacher();
		t1.name = "�����";
		t1.age = 20;
		System.out.println(t1.name+t1.age);
		t1.readyteach();
		t1.teach();
		Teacher t2 = new HighTeacher();
		t2.name = "�����";
		t2.age = 23;
		System.out.println(t2.name+t2.age);
		t2.readyteach();
		t2.teach();
		//ʵ��  ������
	}
}

abstract class Teacher{
	String name;
	int age;
	abstract public void teach();
	abstract public void readyteach();
}

class PeiTeacher extends Teacher{
	public void teach() {
		System.out.println("���Ž���");
	}
	public void readyteach() {
		System.out.println("���ű���");
	}
}

class HighTeacher extends Teacher{
	public void teach() {
		System.out.println("���ֽ���");
	}
	public void readyteach() {
		System.out.println("���ֱ���");
	}
}