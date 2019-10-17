package com.tedu.array;

import java.util.Arrays;
import java.util.Random;

public class Text2_Array2 {

	public static void main(String[] args) {
//		method1();
//		method2();
//		method3();
		method4();
		
		
	}

	private static void method4() {
		int[] a = new int[1000];
		
		System.out.println(Arrays.toString(a));
		for (int k = 0; k < a.length; k++) {
			int ran = new Random().nextInt(1000);
			a[k]= ran;
		}
		for (int i = 0; i <a.length-1; i++) {
			for (int j = 0; j <a.length-1; j++) {
				if(a[j]>a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
	}

	private static void method3() {
		int[] a = new int[10];
		for ( ; ; ) {
			for (int i = 0; i < a.length; i++) {
				int ran = new Random().nextInt(88)+11;
				a[i]= ran;
				//System.out.print(a[i]);
			}
			System.out.println(Arrays.toString(a));
		}
	}

	private static void method2() {
		int[] a= {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < a.length; i++) {
			System.out.println((i+1)+"月有"+a[i]+"天");
		}
		
	}

	private static void method1() {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			//获取到每个下标对应的元素并赋值
			a[i]=i+1;
			//System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
	}

}
