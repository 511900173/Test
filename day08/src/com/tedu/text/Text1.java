package com.tedu.text;

//1�����������ࡣ�ṩ������ֹͣ�����й���
//2���������࣬�̳������ࡣ����/��д ������ֹͣ����
//3������������󣬽�������Ĺ��ܲ���
//4��������̬���󣬽��й��ܲ���
public class Text1 {
	public static void main(String[] args) {
		Bus b = new Bus();
		b.star();
		b.stop();
		b.run();
		Car c = new Bus();
		c.star();
		c.stop();
		c.run();
		b.star(8);
		b.stop(8,6);
	}
}

class Car {

	int age;
	
	public void star() {
		System.out.println("����");
	}


	

	public void stop() {
		System.out.println("ֹͣ");
	}

	public void run() {
		System.out.println("����");
	}
}

class Bus extends Car {

	int age;
	public void shar() {}
	public void star(int age) {
		this.age = age;
		super.age = age;
		System.out.println("���");
		System.out.println(this.age);
		
	}

	public void stop(int age ,int age1) {
		super.age = age;
		this.age = age1;
		System.out.println("����");
		System.out.println(this.age);
		System.out.println(super.age);
	}
}
