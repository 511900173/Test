package com.tedu.for2;

//测试嵌套循环
public class Text2_For2 {

	public static void main(String[] args) {
//		method1();
		method2();
	}

	private static void method2() {
		for (int i = 1; i <10 ; i++) {
			for (int j = 1; j <20 ; j++) {
				System.out.print("■");
				if(i==5&&j==1) {
					for (int j2 = 0; j2 < 17; j2++) {
						System.out.print("□");
					}
					
					j+=17;
				}
				
			}
			System.out.println();
		}
		
	}

	private static void method1() {
		for (int i = 1; i <= 8; i++) {
			System.out.print(i+" " );
			for (int j = 2; j <= 8; j++) {
				System.out.print(j);
			}
			System.out.println(" 中午吃拉面");
		}

	}

}
