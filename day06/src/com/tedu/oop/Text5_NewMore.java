package com.tedu.oop;

//�����������
public class Text5_NewMore {

	public static void main(String[] args) {
		Teacher t = new Teacher(); // ��������
		t.teachNo = 1008; // �����Ը�ֵ
		t.name = "������";

		Teacher t1 = new Teacher();// �����ڶ�������
		t1.name = "����";
		t1.teachNo = 10086;
	}

}

class Teacher { // ������
	int teachNo;
	String name;

	public void show() {
		System.out.println("�����ϿΣ�����");
	}

}
