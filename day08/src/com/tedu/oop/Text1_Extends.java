package com.tedu.oop;
//���Լ̳��г�Ա�������÷�
public class Text1_Extends {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.show();

	}
}

class Fu{ //���常��
	int sum = 30;
}

class Sub extends Fu{ // ��������
	int sum = 20;
	public void show() {
		int sum = 10;
		//�����ľͽ�ԭ��
		System.out.println(sum);
		//ͨ��this���ñ����еĳ�Ա����sum
		System.out.println(this.sum);
		//ͨ��super���ø����еĳ�Ա����sum
		System.out.println(super.sum);
	}
}



