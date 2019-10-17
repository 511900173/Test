package com.tedu.text;

import java.util.Arrays;
import java.util.Scanner;

public class Ttttt {
	public static void main(String[] arg) {
		char A = 'A', B = 'B', C = 'C';
		int score = new Scanner(System.in).nextInt();
		char d = (score >= 90) ? A : (score < 60 ? C : B);
		System.out.println(d);
	}
}

class k { 
	public void dd() { //Êý×éµ¹ÐòÅÅÁÐ
		int arr[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int newArr[] = new int[arr.length];
		for (int i = 0; i < newArr.length; i++) {
			newArr[newArr.length - 1 - i] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}
}