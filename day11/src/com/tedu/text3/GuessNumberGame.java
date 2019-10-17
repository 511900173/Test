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
		System.out.println("已产生1-1000");
		System.out.println("猜猜看");
	}

	@Override
	public String bidui(String r, String c) {
		Integer rr = Integer.parseInt(r);
		Integer cc = Integer.parseInt(c);
		if (cc>rr) {
			return "大";
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
