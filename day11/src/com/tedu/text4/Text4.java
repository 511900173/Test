package com.tedu.text4;

import java.util.LinkedList;
import java.util.Scanner;

public class Text4 {

	public static void main(String[] args) {
		System.out.println("第几个丑数");
		int n = new Scanner(System.in).nextInt();
		long r = g(n);
		System.out.println(r);

	}

	private static long g(int n) {
		if (n==1) {
			return 1;
		}
	LinkedList<Long> list2 = new LinkedList<Long>();
	LinkedList<Long> list3 = new LinkedList<Long>();
	LinkedList<Long> list5 = new LinkedList<Long>();
	list2.add(2L);
	list3.add(3L);
	list5.add(5L);
	long r = 0;
	for (int i = 2; i <= n; i++) {
		long a =list2.getFirst();
		long b =list3.getFirst();
		long c =list5.getFirst();
		r=Math.min(a, Math.min(b, c));
		if (r==a) list2.removeFirst();
		if (r==b) list3.removeFirst();
		if (r==c) list5.removeFirst();
		list2.add(r*2);
		list3.add(r*3);
		list5.add(r*5);
	}
	return r;
		
	}

	private static long f(int n) {
		if (n == 1) {
			return 1;
		}

		int count = 1;
		for (int i = 2;; i++) {
			int j = i;
			while (j % 2 == 0)
				j /= 2;
			while (j % 3 == 0)
				j /= 3;
			while (j % 5 == 0)
				j /= 5;
			if (j == 1) {
				count++;
				if (count == n) {
					return i;
				}
			}

		}

	}

}
