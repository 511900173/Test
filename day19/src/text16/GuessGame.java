package text16;

import java.util.Scanner;

public abstract class GuessGame {
	public void star() {
		String r = suiji();
		tishi();
		while (true) {
			System.out.println("²Â:");
			String c = new Scanner(System.in).nextLine();
			String result = budui(c, r);
			System.out.println(result);
			if (cidui(result)) {
				break;
			}

		}

	}

	public abstract String suiji();

	public abstract void tishi();

	public abstract String budui(String c, String r);

	public abstract boolean cidui(String result);

	
}
