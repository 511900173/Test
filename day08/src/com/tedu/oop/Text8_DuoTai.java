package com.tedu.oop;
//���Զ�̬�����Ű���
public class Text8_DuoTai {

	public static void main(String[] args) {
		Fa ff = new Fa();
		ff.eat();
		Sa ss = new Sa();
		ss.eat();
		Fa f = new Sa();//������̬����/��������/����ת��
		f.eat();// ����ɻ��������
//		f.show();//ͳһ���ñ�׼�����࿴��  
		int ���� = 3;
		System.out.println(����);
		System.out.println("321"+(12+12));
	}

}

class Fa{
	public void eat() {
		System.out.println("��ʲô");
	}
}

class Sa extends Fa{
	public void show() {
		System.out.println("���ٷ�");
	}
	public void eat() {
		System.out.println("�Է���ǽ");
	}
}


