package com.tedu.constructor;
//���Դ����(��������(���캯��)/�ֲ������)
public class Text5_Block {
	public static void main(String[] args) {
		//����Animal����
		//������й������飬����ִ�й���������ִ�й��췽��
		Animal a = new Animal();
		Animal a1 = new Animal();
	}
}
class Animal{
	/*��������...*/
	{
		System.out.println(1);
	}	
	/*�o�ι��췽��*/
	public Animal(){
		System.out.println(2);
	}	
}
