package com.tedu.oop;

public class Text3_Abstract {
	public static void main(String[] args) {
		Fu3 f = new Zi3();
		
	}
}

abstract class Fu3{
	//�������Լ��ǲ��ܴ��������
	//��Ϊ���ഴ������ʱ����ù��캯���е�super()
	//�������еĹ��췽�����������ഴ������
	public Fu3() {
		System.out.println("�ż�");
	}
}
class Zi3 extends Fu3{
	//
	public Zi3() {
		//super();
		System.out.println("��ʱ");
	}
}