package com.tedu.guess01������;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		tishi();
		
		// ʹ��nexti ����ģ����ʾ
		
		while (true) {
			try {
				f1();
			} catch (InputMismatchException e) {
				System.out.println("���������������");
				tishi();
			}catch (NumberFormatException e) {
				System.out.println("���������������");
				tishi();
			}catch (StringIndexOutOfBoundsException e) {
				System.out.println("���������������");
				tishi();
			}
		}
	}

	private static void tishi() {
		System.out.println("1.������");
		System.out.println("2.����ĸ");
		System.out.println("ѡ��>");
		
	}

	private static void f1() {
		int c = new Scanner(System.in).nextInt();
		GuessGame game;
		if (c == 1) {
			game = new GuessNumberGame();
		} else if (c == 2) {
			game = new GuessLetterGame();
		} else {
			System.out.println("ѡ�����");
			return;
		}
		// ִ��ͨ�����̴��룬���õ��ĸ�������ִ������ʵ�ֵĴ���
		game.start();
		// �����ͱ���������������ʵ��

	}
}
