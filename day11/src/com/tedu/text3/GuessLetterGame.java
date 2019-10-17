package com.tedu.text3;

import java.util.Random;

public class GuessLetterGame extends GuessGame{

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
		System.out.println("²úÉú×ÖÄ¸");
		System.out.println("²Â²Â");
	}

	@Override
	public String bidui(String r, String c) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (r.charAt(i)==c.charAt(j)) {
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
