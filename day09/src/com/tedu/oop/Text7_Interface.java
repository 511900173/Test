package com.tedu.oop;
//���Խ�ڵ����Ű���
public class Text7_Interface {
	public static void main(String[] args) {
		Fu7 f = new Zi7();
		f.eat();
		f.sleep();
	}
}
//ͨ��interface�ؼ��ֶ�����
interface Fu7{
	//�ӿ���ȫ���ǳ��󷽷�
	abstract public void eat();
	abstract public void sleep();
}
	
class Zi7 implements Fu7{
	@Override//ע�� @
	public void eat() {	
		System.out.println("�̼�");
	}
	@Override
	public void sleep() {		
		System.out.println("��ɴ�");
	}

}