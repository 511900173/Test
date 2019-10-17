package com.tedu.text3;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		System.out.println("1---");
		System.out.println("2---");
		System.out.println(">>>");
		int c = new Scanner(System.in).nextInt();
		GuessGame game;
		if (c==1) {
			game = new GuessNumberGame();
		}else {
			game = new GuessLetterGame();
		}
		game.start();
		
	}

}
