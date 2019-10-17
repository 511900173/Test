package com.tedu.basic;

public class Text97 {
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 7; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i*2-1 ; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			
		}
		for (int i = 0; i < 5; i++) {
			for (int l = 1; l < 6; l++) {
				System.out.print(" ");
			}
			for (int m = 1; m < 6; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
