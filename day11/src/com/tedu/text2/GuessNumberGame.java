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
		System.out.println("�Ѳ���[1,1001)ֱ�ӵ��������");
		System.out.println("�²������");
	}
	@Override
	public String bidui(String c, String r) {
		Integer cc = Integer.parseInt(c);
		Integer rr = Integer.parseInt(r);
		if (cc > rr) {
			return "��";
		} else if (cc < rr) {
			return "С";
		} else {
			return "��";
		}
	}
	@Override
	public boolean caidui(String result) {
		return "��".equals(result);
	}

}
