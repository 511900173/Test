package com.tedu.oop;
//���Ծ�̬�����
public class Text6_Static {
	static String s = "345";
	public static void main(String[] args) {
		new Animal();
//		System.out.println(Animal.name);
		new Animal();
//		System.out.println(Animal.name);
		//���������ζ����Ǿ�̬�������ִ����һ��
		System.out.println(s);
	}

}


class Animal{
	static String name = "����";
	static {
		System.out.println(name);
	}
	public Animal() {
		System.out.println(1);
	}
}