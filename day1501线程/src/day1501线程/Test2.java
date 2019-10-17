package day1501线程;

import java.util.Arrays;

public class Test2 {
	static char[] a = { '*', '*', '*', '*', '*', '*', '*', '*' };
	static char c = '-';

	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				// 死循环修改数组
				while (true) {
					// 线程执行到同步块
					// 要先抢a数组的锁,才能进入执行
					synchronized (a) {
						for (int i = 0; i < a.length; i++) {
							a[i] = c;
						}
					}
					c = c == '-' ? '*' : '-';
				}
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				while (true) {
					synchronized (a) {
						System.out.println(Arrays.toString(a));
					}
				}
			}
		}.start();

	}

}
