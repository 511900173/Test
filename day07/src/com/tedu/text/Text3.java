package com.tedu.text;

public class Text3 {
	public static void main(String[] args) {
		Ez e = new Ez();
		Ez e1 = new Ez("8888");
		e1.Cong();
		e.setNum(9999);
		System.out.println(e.getNum());
		System.out.println(e.name + e.age);
		e.Cong();
	}
}

class Student2 {
	{
		System.out.println("��Ҫ����");
	}
	String name;
	int age;
	String car;
	private int num;
	{
		car = "��Ʒ�";
	}

	public Student2() {
		{
			System.out.println(10001);
		}
		name = "����";
		System.out.println("��ʲô��" + car);
		{
			age = 20;
		}
	}

	public Student2(String a) {

		System.out.println(a + car);
	}

	public void Cong() {
		{
			System.out.println(22222);
		}
		System.out.println("1+1=2");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	{
		System.out.println("��Ҫ����" + car);
	}
}

class Son extends Student2 {
}

class Ez extends Son {
	public Ez() {
	}

	public Ez(String name) {
		super.name = name;
		System.out.println(super.name);
		super.Cong();
	}

	public void Cong() {
		System.out.println("��д");
	}
}
