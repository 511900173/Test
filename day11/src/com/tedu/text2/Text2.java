package com.tedu.text2;

import java.util.Scanner;

public abstract class Text2 {
	public static void main(String[] args) {
		
		System.out.println("1.������");
		System.out.println("2.����ĸ");
		System.out.println("ѡ��>");
		
		int c = new Scanner(System.in).nextInt();
		
		GuessGame game;
		
		if (c==1) {
			game = new GuessNumberGame();
		}else {
			game = new GusessLetterGame();
		}
		game.star();
	}
	
}