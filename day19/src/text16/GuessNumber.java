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
		System.out.println("������1-1000֮����������");
	}

	@Override
	public String budui(String c, String r) {
		Integer cc = Integer.parseInt(c);
		Integer rr = Integer.parseInt(r);
		if (cc>rr) {
			return "�´���";
		}else if (cc<rr) {
			return "��С��";
		}else {
			return "����";
		}
	}

	@Override
	public boolean cidui(String result) {
		return "����".equals(result);
	}

}
