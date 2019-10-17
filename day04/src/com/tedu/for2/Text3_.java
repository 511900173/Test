package com.tedu.for2;

public class Text3_ {

	public static void main(String[] args) {
		method1();
		method2();
	}

	private static void method2() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}

	}

	private static void method1() {
		for (int i = 1; i <= 8; i++) {
			for (int k = 8 - i; k >= 0; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				
				System.out.print("¡ø");
				
			}

			System.out.println();
		}
		for (int l = 1; l <= 5; l++) {

			for (int o = 5; o >= 0; o--) {
				System.out.print(" ");
			}
			for (int p = 1; p < 6; p++) {
				System.out.print("¡¬");
			}
			System.out.println();
		}

	}

}
