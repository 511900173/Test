package day1204�쳣;

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
				e.printStackTrace();//��ӡһ��������Ϣ
				System.err.println("����������һ����");
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.err.println("���ܳ�0");
			} catch (Exception e) {
				System.err.println("����������");
			} finally {
				System.err.println("------------------------");
			}
		}
		
	}

	private static void f1() {
		System.out.println("���붺�Ÿ�������������:");
		String s = new Scanner(System.in).nextLine();
		// ���
		String[] a = s.split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		int r = n1 / n2;
		System.out.println(r);

	}

}
