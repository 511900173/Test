package com.tedu.constructor;
//���Լ̳й�ϵ
public class Text7_Extends {
	public static void main(String[] args) {
//		Sub s = new Sub();
//		s.skin = "��ɫ";
//		System.out.println(s.skin);
//		System.out.println(s.language);
//		s.eat();
//		s.setNum(9981);
//		System.out.println(s.getNum());
		Sun s2 = new Sun();
		System.out.println(s2.language);
		System.out.println(s2.skin);
		s2.eat();
		s2.setNum(888888);
		System.out.println(s2.getNum());
	}
}
class Fu{
	private int num;
	{
		System.out.println(9527);
	}
	String skin;
	String language;
	public void eat() {
		System.out.println("����");
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}	
}
//ͨ��extends�ؼ��ֺ͸��෢���̳й�ϵ
class Sub extends Fu{
	//�̳о��൱��Ѹ���Ĺ��ܸ�����һ��
	public void eat() {
		System.out.println("����");
		System.out.println(super.language);
	}
}
class Sun extends Sub{
	{
		super.eat();
		System.out.println("ʲô��");
		super.setNum(777777);
		System.out.println(super.getNum());
	}
}
