package com.tedu.text3;

import java.util.Random;

public class GuessNumberGame extends GuessGame{

	@Override
	public String suiji() {
		int r = 1+new Random().nextInt(1000);
		return String.valueOf(r);
	}
	@Override
	public void tishi() {
		System.out.println("�Ѳ���1-1000");
		System.out.println("�²¿�");
	}

	@Override
	public String bidui(String r, String c) {
		Integer rr = Integer.parseInt(r);
		Integer cc = Integer.parseInt(c);
		if (cc>rr) {
			return "��";
		}else if (cc<rr) {
			return "xiao";
		}else {
			return "d";
		}
	}

	@Override
	public boolean caidui(String result) {
		return "d".equals(result);
	}

}
