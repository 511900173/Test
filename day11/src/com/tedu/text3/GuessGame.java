package com.tedu.text3;

import java.util.Scanner;

public abstract class GuessGame {
	public void start() {
		String r = suiji();
		tishi();
		
		while (true) {
			System.out.println("²Â");
			
			String c = new Scanner(System.in).nextLine();
			String result = bidui(r,c);
			System.out.println(result);
			if (caidui(result)) {
				break;
			}
		}
	}

	public abstract String suiji();

	public abstract void tishi();

	public abstract String bidui(String r, String c);

	public abstract boolean caidui(String result);
}
