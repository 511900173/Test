package day1301异常;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		System.out.println("输入两个浮点数");
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		try {
			double r = divide(a, b);
			System.out.println(r);
		} catch (Exception e) {
			System.out.println("除数不能为0是我们的错");
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
