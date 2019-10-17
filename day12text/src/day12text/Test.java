package day12text;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("1.猫");
		System.out.println("2.狗");
		System.out.println("3.猪");
		System.out.println("4.吱吱");
		try {
			choose();
		} catch (InputMismatchException e) {
			System.out.println("不要输入字母，请输入数字");
		}
		
		System.out.println("起个名字：");
		String name = new Scanner(System.in).nextLine();
		System.out.println("付费：");
		try {
			money();
		} catch (Exception e) {
			System.out.println("请输入正确的钱数");
		}
		
		Pet p;
		if (choose() == 1) {
			if (money() == 100) {
				p = new Cat(name, 100, 100);
			} else {
				p = new Cat(name);
			}

		} else if (choose() == 2) {
			if (money() == 100) {
				p = new Dog(name, 100, 100);
			} else {
				p = new Dog(name);
			}
		} else if (choose() == 3) {
			if (money() == 100) {
				p = new Pig(name, 100, 100);
			} else {
				p = new Pig(name);
			}
		} else if (choose() == 4) {
			if (money() == 100) {
				p = new Zhi(name, 100, 100);
			} else {
				p = new Zhi(name);
			}
		} else {
			System.out.println("输入错误！");
			return;
		}
		
		try {
			f(p);
		} catch (InputMismatchException e) {
			System.out.println("不要输入字母，请输入数字");
		}

	}

	

	

	private static int money() {
		int m = new Scanner(System.in).nextInt();
		return m;
		
	}





	private static int choose() {
		int c = new Scanner(System.in).nextInt();
		return c;
	}





	private static void f(Pet p) {
		System.out.println("按回车执行");
		while (true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(7);
			switch (r) {
			case 0:
				p.feed();
				break;
			case 1:
				p.play();
				break;
			default:
				p.da();
				break;
			}
		}

	}

}
