package com.tedu.text;

import java.util.Arrays;
import java.util.Scanner;

public class Text1 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6 };
		System.out.println("����Ҫɾ�����±�λ��");
		@SuppressWarnings("resource")
		int a = new Scanner(System.in).nextInt();
		int[] newArr = remove(arr, a);
		System.out.println(Arrays.toString(newArr));
	}

//��һ�����飬��Ԫ������Ϊ {2,3,4,5,6}��
//��ɾ��λ��Ϊ1��Ԫ�غ󣬸������Ԫ�����ݸ���Ϊ{2,4,5,6}��
	private static int[] remove(int[] ary, int a) {
		for (int i = a; i < ary.length-1; i++) {
			ary[i] = ary[i + 1];
		}
		int[] newArr = Arrays.copyOf(ary, ary.length - 1);
		return newArr;
	}

}
