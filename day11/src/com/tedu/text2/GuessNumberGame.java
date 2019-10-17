package com.tedu.text2;

import java.util.Random;

public class GuessNumberGame extends GuessGame {
	@Override
	public String suiji() {
		int r = 1 + new Random().nextInt(1000);
		return String.valueOf(r);
	}
	@Override
	public void tishi() {
		System.out.println("已产生[1,1001)直接的随机整数");
		System.out.println("猜猜这个数");
	}
	@Override
	public String bidui(String c, String r) {
		Integer cc = Integer.parseInt(c);
		Integer rr = Integer.parseInt(r);
		if (cc > rr) {
			return "大";
		} else if (cc < rr) {
			return "小";
		} else {
			return "对";
		}
	}
	@Override
	public boolean caidui(String result) {
		return "对".equals(result);
	}

}
