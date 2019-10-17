package com.tedu.text;

import java.util.Arrays;
import java.util.Scanner;

public class Text1 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6 };
		System.out.println("输入要删除的下标位置");
		@SuppressWarnings("resource")
		int a = new Scanner(System.in).nextInt();
		int[] newArr = remove(arr, a);
		System.out.println(Arrays.toString(newArr));
	}

//有一个数组，其元素内容为 {2,3,4,5,6}，
//当删除位置为1的元素后，该数组的元素内容更改为{2,4,5,6}。
	private static int[] remove(int[] ary, int a) {
		for (int i = a; i < ary.length-1; i++) {
			ary[i] = ary[i + 1];
		}
		int[] newArr = Arrays.copyOf(ary, ary.length - 1);
		return newArr;
	}

}
