package com.tedu.text;
//����������Ű�ѧԱ�����ְ�ѧԱ
//���ԣ�������ѧϰ���ݼ�
//����ѧԱ���󣬵����ṩ�Ĺ���

public class Text3 {

	public static void main(String[] args) {
		Student s1 = new JsdStudent();
		s1.rest();
		s1.study();
		Student s2 = new CgbStudent();
		s2.rest();
		s2.study();
	}

}

abstract class Student{
	String name;
	public abstract void study();
	public abstract void rest();
}
class CgbStudent extends Student{
	@Override
	public void study() {
		System.out.println("ѧϰcgb");
	}
	@Override
	public void rest() {
		System.out.println("��Ϣ1��");
	}
}
class JsdStudent extends Student{
	@Override
	public void study() {
		System.out.println("ѧϰjsd");
	}
	@Override
	public void rest() {
		System.out.println("��Ϣ334");
	}
}