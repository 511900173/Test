package day20;

import java.util.ArrayList;

/*
 * 1.一个数组,判断这个数是质数 ,就放质数进去
 * 2.写一个方法 判断是质数,是的话返回true
 * 
 * 1.遍历100
 * 2.判断这个数是是否是质数
 * 3.输出这个数
 */
public class aa {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 2; i < 1000000; i++) {
			if (iszhishu(i)) {
				arr.add(i);
			}
		}
		System.out.println(arr);
		
	}

	private static boolean iszhishu(int i) {
		for (int j = 2; j < Math.sqrt(i); j++) {
			if (i%j==0) {
				return false;
			}
		}

		return true;
	}

	
}