package com.tedu.guess01������;

import java.util.Random;

public class GuessNumberGame extends GuessGame{
	@Override
	public String suiji() {
		// 1+[0,1000)
		int r = 1+new Random().nextInt(1000);
		//System.out.println(r);
		// intת��String
		return String.valueOf(r);
	}
	@Override
	public void tishi() {
		System.out.println("�Ѿ�������[1,1001)��Χ���������");
		System.out.println("����������");
	}
	@Override
	public String biDui(String c, String r) {
		// String ת��int
		int cc = Integer.parseInt(c);
		int rr = Integer.parseInt(r);
		if (cc>rr) {
			return "��";
		} else if (cc<rr) {
			return "С";
		} else {
			return "��";
		}
	}
	@Override
	public boolean caiDui(String result) {
		return "��".equals(result);
	}

}
