package text16;

import java.util.Scanner;

public class RunApp {
	public static void main(String[] args) {
		System.out.println("1.������");
		System.out.println("2.����ĸ");
		System.out.println("ѡ��>>>");
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
