package com.tedu.overload;

import java.util.Arrays;
import java.util.Random;

//���Է�������ovaerload
//1,��������ͬ 2,�����б�ͬ
public class Text_Overload {

	public static void main(String[] args) {
		method();//���ßo�η���
		method(10);//����int�����ķ���
		method("ʲô����");//����String�����ķ���
		method('��');
		method(10,20);//��������int �����ķ���
		method(1,'��');
		method('��',1);
		methoda();//����ĸ��� ���� sort����
		methodaa();

	}

	private static void methodaa() {
		int[][] a = { { 1, 2 }, { 2, 3 }, { 5, 6 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + ",");
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(a));

	}

	private static void methoda() {
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);
		}
		System.out.println(Arrays.toString(a));
		
		int[] na = Arrays.copyOf(a, 8);
		System.out.println(Arrays.toString(na));

		int[] naa = Arrays.copyOf(a, 3);
		System.out.println(Arrays.toString(naa));

	}

	private static void method(int i, int j) {
		System.out.println(i + j);
		System.out.println(i);
		System.out.println(j);
	}

	private static void method(char a) {
		System.out.println(a);
	}

	private static void method(String s) {
		System.out.println(s);

	}

	private static void method(int i) {
		System.out.println(i);

	}

	private static void method() {
		System.out.println("���������");

	}

}
