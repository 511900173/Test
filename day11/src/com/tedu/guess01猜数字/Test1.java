package com.tedu.guess01猜数字;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		tishi();
		
		// 使用nexti 代码模版提示
		
		while (true) {
			try {
				f1();
			} catch (InputMismatchException e) {
				System.out.println("输入错误，重新运行");
				tishi();
			}catch (NumberFormatException e) {
				System.out.println("输入错误，重新运行");
				tishi();
			}catch (StringIndexOutOfBoundsException e) {
				System.out.println("输入错误，重新运行");
				tishi();
			}
		}
	}

	private static void tishi() {
		System.out.println("1.猜数字");
		System.out.println("2.猜字母");
		System.out.println("选择：>");
		
	}

	private static void f1() {
		int c = new Scanner(System.in).nextInt();
		GuessGame game;
		if (c == 1) {
			game = new GuessNumberGame();
		} else if (c == 2) {
			game = new GuessLetterGame();
		} else {
			System.out.println("选择错误");
			return;
		}
		// 执行通用流程代码，调用的四个方法，执行子类实现的代码
		game.start();
		// 父类型变量，引用子类型实例

	}
}
