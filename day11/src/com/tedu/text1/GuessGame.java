package com.tedu.text1;

import java.util.Scanner;

public abstract class GuessGame {
	public void star() {
		//�������
		String r = suiji();
		//��ʾ
		tishi();
		//ѭ����
		while(true) {
			System.out.print("��:");
			String c = new Scanner(System.in).nextLine();
			String result = bidui(c,r);
			System.out.println(result);
			if (caidui(result)) {
				break;
			}
		}
		
	}

	public abstract String suiji();

	public abstract void tishi();

	public abstract String bidui(String c, String r);

	public abstract boolean caidui(String result);

}
