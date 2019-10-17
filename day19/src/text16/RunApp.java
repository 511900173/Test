package text16;

import java.util.Scanner;

public class RunApp {
	public static void main(String[] args) {
		System.out.println("1.²ÂÊý×Ö");
		System.out.println("2.²Â×ÖÄ¸");
		System.out.println("Ñ¡Ôñ>>>");
		int c = new Scanner(System.in).nextInt();
		
		GuessGame guess;
		if (c==1) {
			guess = new GuessNumber();
		} else {
			guess = new GuessLetter();
		}
		
		guess.star();
		
	}
}
