package text16;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber extends GuessGame{

	@Override
	public String suiji() {
		int s = new Random().nextInt(1000)+1;
		return String.valueOf(s);
	}

	@Override
	public void tishi() {
		System.out.println("已生成1-1000之间的随机整数");
	}

	@Override
	public String budui(String c, String r) {
		Integer cc = Integer.parseInt(c);
		Integer rr = Integer.parseInt(r);
		if (cc>rr) {
			return "猜大了";
		}else if (cc<rr) {
			return "猜小了";
		}else {
			return "对了";
		}
	}

	@Override
	public boolean cidui(String result) {
		return "对了".equals(result);
	}

}
