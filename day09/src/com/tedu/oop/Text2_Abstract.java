package com.tedu.oop;

public class Text2_Abstract {

	public static void main(String[] args) {
		Fu1 f = new Sub1();
		f.eat();
		f.sleep();
	}
}

//�������п�������ͨ����Ҳ�����г��󷽷�
//������а������󷽷������������ǳ�����
abstract class Fu1 {
	// �ձ鷽��
	public void sleep() {
		System.out.println("˯��");
	}
	// ���󷽷���û�з����壬��Ҫ��abstract����
	abstract public void eat();
}

//������Լ̳г����࣬
//����Ҫ�ѳ������еĳ��󷽷�ȫ����д���������໹�ǳ����࣬
class Sub1 extends Fu1 {
	public void eat() {
		System.out.println("������");
	}

}