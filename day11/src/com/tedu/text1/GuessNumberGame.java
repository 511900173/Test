package com.tedu.text1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame extends GuessGame{

	@Override
	public String suiji() {
		int r =1+ new Random().nextInt(1000); 
		
		return String.valueOf(r);
	}

	@Override
	public void tishi() {
		System.out.println("已经产生[1,1001)之间的随机整数");
		System.out.println("猜猜这个数");
	}

	@Override
	public String bidui(String c, String r) {
		int cc = Integer.parseInt(c);
		int rr = Integer.parseInt(r);
		if (cc>rr) {
			return "大了";
		} else if (cc<rr) {
			return "小了";
		}else {
			return "对了";
		}
	}

	@Override
	public boolean caidui(String result) {
		return "对了".equals(result);
	}
	
	
	
	
}
