package com.tedu.oop;

public class Text4_Abstract {
	public static void main(String[] args) {
		Fu4 f = new Zi4();
		f.age=3;
		System.out.println(f.name);
				System.out.println(f.name2);
		System.out.println(f.name3);
	}
}
//�ڳ������п����б���Ҳ�����г���
abstract class Fu4{
	int age ;
	String name;
	String name2 = "���";
	final String name3 = "С�컨";
}
class Zi4 extends Fu4{
	
}
