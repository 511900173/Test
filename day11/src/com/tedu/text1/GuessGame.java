package com.tedu.text1;

import java.util.Scanner;

public abstract class GuessGame {
	public void star() {
		//产生随机
		String r = suiji();
		//提示
		tishi();
		//循环猜
		while(true) {
			System.out.print("猜:");
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
