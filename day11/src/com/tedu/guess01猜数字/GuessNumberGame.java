package com.tedu.guess01猜数字;

import java.util.Random;

public class GuessNumberGame extends GuessGame{
	@Override
	public String suiji() {
		// 1+[0,1000)
		int r = 1+new Random().nextInt(1000);
		//System.out.println(r);
		// int转成String
		return String.valueOf(r);
	}
	@Override
	public void tishi() {
		System.out.println("已经产生了[1,1001)范围的随机整数");
		System.out.println("请猜这个整数");
	}
	@Override
	public String biDui(String c, String r) {
		// String 转成int
		int cc = Integer.parseInt(c);
		int rr = Integer.parseInt(r);
		if (cc>rr) {
			return "大";
		} else if (cc<rr) {
			return "小";
		} else {
			return "对";
		}
	}
	@Override
	public boolean caiDui(String result) {
		return "对".equals(result);
	}

}
