package day1204异常;

import java.util.Scanner;

public class Text1 {
	/*
	 * "165165,552"--> ["165165","552"] 0 1 165165/552
	 */
	public static void main(String[] args) {
		
		while (true) {
			try {
				f1();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();//打印一次完整信息
				System.err.println("两个！不是一个！");
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.err.println("不能除0");
			} catch (Exception e) {
				System.err.println("出错，请重试");
			} finally {
				System.err.println("------------------------");
			}
		}
		
	}

	private static void f1() {
		System.out.println("输入逗号隔开的两个整数:");
		String s = new Scanner(System.in).nextLine();
		// 拆分
		String[] a = s.split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		int r = n1 / n2;
		System.out.println(r);

	}

}
