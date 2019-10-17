package com.tedu.linklist03丑数;

import java.util.LinkedList;
import java.util.Scanner;

//能别235整除多次，整除成1 
//1也是丑数      1.2.3.4.5.6.8.9.10.12.15.16.18.20...
//求第n个丑数
public class Text1 {
	public static void main(String[] args) {
		System.out.println("求第几个丑数");
		int n = new Scanner(System.in).nextInt();
		long r = f(n);
		System.out.println(r);
	}

	private static long f(int n) {
		if (n == 1) {
			return 1;//1也是丑数
		}
		/*
		 * 2 4 8
		 * ------------------- *2
		 * 3 6 9
		 * ------------------- *3
		 * 5 10 15
		 * ------------------- *5
		 * 
		 * 1.头部最小值
		 * 2.乘2，3，5放入三个集合
		 */
		LinkedList<Long> list2 = new LinkedList<Long>();
		LinkedList<Long> list3 = new LinkedList<Long>();
		LinkedList<Long> list5 = new LinkedList<Long>();
		list2.add(2L);
		list3.add(3L);
		list5.add(5L);
		long r = 0;//保存每一次取出的丑数
		//从第2个求到第n个
		for (int i = 2; i <= n; i++) {
			long a = list2.getFirst();
			long b = list3.getFirst();
			long c = list5.getFirst();
			//
			r = Math.min(a, Math.min(b, c));
			//
			if (r==a) list2.removeFirst();
			if (r==b) list3.removeFirst();
			if (r==c) list5.removeFirst();
			//
			list2.add(r*2);
			list3.add(r*3);
			list5.add(r*5);
		}

		return r;
		
		
	}
}
