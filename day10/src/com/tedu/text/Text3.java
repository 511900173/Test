package com.tedu.text;

import java.util.Scanner;

public class Text3 {
	static int mima;
	static String input;
	public static void main(String[] args) {
		System.out.println("����4λ������");
		mima = new Scanner(System.in).nextInt();
		System.out.println("������4λ������");
		do {
			input = new Scanner(System.in).nextLine();
			if(input.equals(mima)) {
				System.out.println("��ȷ");
			}else {
				System.out.println("����");
			}
			
		}while (true);
		
	}

	@Override
	public boolean equals(Object obj) {
		boolean s = (String) obj != null;
		return s = input != null;
	}

}
