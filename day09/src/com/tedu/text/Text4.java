package com.tedu.text;
//������������������µ�����
//���ԣ���ɫ���ͺţ������������ܷ���
//�����������󣬵����ṩ�Ĺ���

public class Text4 {
	public static void main(String[] args) {
		Car c1 = new AoCar();
		c1.star();
		c1.run();
		Car c2 = new BmwCar();
		c2.star();
		c2.run();//  0 0 0 1 1 1
	}
}

abstract class Car{
	String color;
	String model;
	public abstract void star();
	public abstract void run();
}
class AoCar extends Car{
	public void star() {
		System.out.println("��������");
	}
	public void run() {
		System.out.println("����2.5");
	}
}
class BmwCar extends Car{
	public void star() {
		System.out.println("��������");
	}
	public void run() {
		System.out.println("����9.9");
	}
}