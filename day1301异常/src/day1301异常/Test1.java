package day1301�쳣;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		System.out.println("��������������");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double r = divide(a, b);
			System.out.println(r);
		} catch (Exception e) {
			System.out.println("��������Ϊ0�����ǵĴ�");
			e.printStackTrace();
		}

	}

	private static double divide(double a, double b) {
		if (b == 0) {
			ArithmeticException e = new ArithmeticException("/ bye 00000");
			throw e;
		}
		return a / b;

	}
}
