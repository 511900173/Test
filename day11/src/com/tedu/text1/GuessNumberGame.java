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
		System.out.println("�Ѿ�����[1,1001)֮����������");
		System.out.println("�²������");
	}

	@Override
	public String bidui(String c, String r) {
		int cc = Integer.parseInt(c);
		int rr = Integer.parseInt(r);
		if (cc>rr) {
			return "����";
		} else if (cc<rr) {
			return "С��";
		}else {
			return "����";
		}
	}

	@Override
	public boolean caidui(String result) {
		return "����".equals(result);
	}
	
	
	
	
}
