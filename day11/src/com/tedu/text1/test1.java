package com.tedu.text1;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		System.out.println("1.������");
		System.out.println("2.����ĸ");
		System.out.println("ѡ��>");
		int c = new Scanner(System.in).nextInt();
		GuessGame game;
		if (c==1) {
			game = new GuessNumberGame();
		}else {
			game = new GuessLetterGame();
		}
		
		game.star();
	}
}
