package com.tedu.oop;

import java.util.Arrays;

public class Text7_Final {

	public static void main(String[] args) {

	}
}

//��final���ε��࣬���ܱ��̳�
//final class Zoo{
class Zoo {
	// ��final���εı����Ǹ����������ܱ��ı�
	final String name = "С�Ϲ�";

	// 2,��final���εķ��������ܱ���д
//	public final void eat() {
	public void eat() {
		System.out.println("�ż�");
		// name = "����";
	}
}

class Zi extends Zoo {
	public final void eat() {
		// super.name = "����";
		System.out.println(super.name);
		System.out.println("�ǵ�");
	}
}