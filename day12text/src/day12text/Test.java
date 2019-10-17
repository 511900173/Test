package day12text;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("1.è");
		System.out.println("2.��");
		System.out.println("3.��");
		System.out.println("4.֨֨");
		try {
			choose();
		} catch (InputMismatchException e) {
			System.out.println("��Ҫ������ĸ������������");
		}
		
		System.out.println("������֣�");
		String name = new Scanner(System.in).nextLine();
		System.out.println("���ѣ�");
		try {
			money();
		} catch (Exception e) {
			System.out.println("��������ȷ��Ǯ��");
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
			System.out.println("�������");
			return;
		}
		
		try {
			f(p);
		} catch (InputMismatchException e) {
			System.out.println("��Ҫ������ĸ������������");
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
		System.out.println("���س�ִ��");
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
