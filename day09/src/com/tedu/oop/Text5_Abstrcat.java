package com.tedu.oop;
//���Գ������﷽�����÷�
public class Text5_Abstrcat {
	public static void main(String[] args) {
		Fu5 f = new Zi5();
		f.sleep();
		f.eat();
	}
}

abstract class Fu5{
	//��ͨ����
	public void eat() {
		System.out.println("�̼�");
	}
	//���󷽷� -- ����������/ǩ��
	abstract public void sleep();
}

class Zi5 extends Fu5{
	//��д���󷽷�
	public void sleep() {
		System.out.println("����");
	}
}