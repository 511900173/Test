package com.tedu.oop;
//���Զ�̬��ʹ��
public class Text1_DuoTai {

	public static void main(String[] args) {
		Fu f = new Sub();
		// ���뿴��� ���п��ұ�
		f.eat();//ִ��Ч�������� �����д������д��Ч��
		//������ʹ�ã�����ʲô����Ҫ������	
//		f.sleep();
		//��Ա������ʹ�� ��̬��ֻ�ܵ��ø����ṩ�Ĺ���
		System.out.println(f.num);
		//��̬��Դ��ʹ�� ˭���þ���˭�� f�Ǹ�������;
		System.out.println(f.age);
		System.out.println(Sub.age);//����ͨ��������������
	}
	
}
//ǰ�᣺�̳�+��д
class Fu{
	static int age = 1000;
	int num = 10;
	public void eat(){
		System.out.println("������");
	}
}
class Sub extends Fu{
	static int age = 2000;
	int num = 20;
	public void eat() {
		System.out.println("�Բ˲�");
	}
	public void sleep() {
		System.out.println("jkfjkdjf");
	}
}