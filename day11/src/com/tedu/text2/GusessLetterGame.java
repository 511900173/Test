package com.tedu.text2;

import java.util.Random;

public class GusessLetterGame extends GuessGame{
	@Override
	public String suiji() {
		StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for (int i = 0; i < 5; i++) {
			int j = i+new Random().nextInt(26-i);
			char t = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, t);
		}
		sb.delete(5, 26);
		System.out.println(sb);
		return sb.toString();
	}
	@Override
	public void tishi() {
		System.out.println("�Ѳ���������ظ��Ĵ�д��ĸ");
		System.out.println("�²��������ĸ");
	}
	@Override
	public String bidui(String c, String r) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (c.charAt(i)==r.charAt(j)) {
					if (i==j) {
						a++;
					}else {
						b++;
					}
					break;
				}
			}
		}
		return a+"A"+b+"B";
	}
	@Override
	public boolean caidui(String result) {
		return "5A0B".equals(result);
	}
}
