package com.tedu.text2;

import java.util.Scanner;

public abstract class GuessGame {

	public void star() {
		String r = suiji();
		tishi();
		while (true) {
			System.out.println("²Â£º");
			String c = new Scanner(System.in).nextLine();
			String result = bidui(c, r);
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
