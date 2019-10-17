package com.tedu.array;

import java.util.Arrays;
import java.util.Random;

public class Text3_Bubble {

	static int num=new Random().nextInt();

	public static void main(String[] args) {
		int[] arr = method1();
		System.out.println(Arrays.toString(arr));

		int[] newArr = method2(arr);
		System.out.println(Arrays.toString(newArr));
		int num = 99;
		System.out.println(num);
		int[] a = new int[5];

	}

	private static int[] method2(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j + 1];
					a[j + 1] = a[j];
					a[j] = t;
				}
			}
		}
		return a;
	}

	private static int[] method1() {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}

}
