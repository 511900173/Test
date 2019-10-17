package com.tedu.text;

import java.util.Scanner;

/*
 * 有一对兔子，从出生后第三个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月有生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少
 * 
 */
public class TextTwo {

	public static void main(String[] args) {
		
		int num;
		for (int i = 0; i < 24; i++) {
			num = method1(i);
			System.out.println(num);
		}

	}

	public static int method1(int i) {
		

		if ((i == 1)||(i==2)) {
			return 1;
		} else {
			return method1(i - 1)+method1(i - 2);
		}

	}

}
