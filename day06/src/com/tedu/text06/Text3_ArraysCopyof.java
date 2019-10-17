package com.tedu.text06;
import java.util.Arrays;
//Arrays.sort
//Arrays.copyof
//Arrays.tostring
import java.util.Random;

public class Text3_ArraysCopyof {

	public static void main(String[] args) {
		int[] arr = method1(); //创建随机数组
		System.out.println(Arrays.toString(arr));
		int[] arr1 = Arrays.copyOf(arr, 8);
		System.out.println(Arrays.toString(arr1));
		int[] arr2 = Arrays.copyOf(arr1, 13);
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int[] newArr = method2(arr);
		System.out.println(Arrays.toString(newArr));

	}

	private static int[] method2(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]<a[j+1]) {
					int t = a[j+1];
					a[j+1]= a[j];
					a[j]=t;
				}
			}
		}
		return a;
	}

	private static int[] method1() {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i]= new Random().nextInt(100)+1;
		}
		
		return a;
	}

}
