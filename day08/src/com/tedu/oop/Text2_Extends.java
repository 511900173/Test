package com.tedu.oop;
//���Լ̳��г�Ա�������÷�
public class Text2_Extends {

	public static void main(String[] args) {
		Sub2 s = new Sub2();
		s.eat();//������д��eat()���Ӵ�eat()��ʵ�־͸��ǵ��˸����ԭ�й���
		s.study();//���໹���Ե����Լ��Ĺ��ܿ��Ե��ø���Ĺ���
		
	}

}

class Fu2{
	public void eat() {
		System.out.println("����");
	}
}

class Sub2 extends Fu2{
	//�������еĹ���
	public void study() {
		System.out.println("ѧϰ");
	}
	//��д�����������͸�����ȫһ�£����޸ĸ���ԭ�еĹ���
	public void eat() {
		super.eat();//��Ȼ����ͨ��super����ԭ�й���
		System.out.println("���");
	}
	
}
                                                                       