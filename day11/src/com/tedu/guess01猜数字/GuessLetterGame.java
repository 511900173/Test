package com.tedu.guess01猜数字;

import java.util.Random;

public class GuessLetterGame extends GuessGame{
	@Override
	public String suiji() {
		/*
		 * StringBuilder
		 *                     j           
		 * "ABCEDFGHIJKLMNOPQRSTUVWXYZ"
		 *  i
		 */
		StringBuilder sb = new StringBuilder(
				"ABCEDFGHIJKLMNOPQRSTUVWXYZ");
		// i循环方位前5个位置
		for (int i = 0; i < 5; i++) {
			// [i,26)
			// i + [0,26-i) 随机定位j位置
			int j = i + new Random().nextInt(26-i);
			// 交换i,j位置的字符
			char t = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, t);
		}
		//删除[5,26)
		sb.delete(5, 26);
		System.out.println(sb);
		return sb.toString();//把sb中的字符创建成String
	}
	@Override
	public void tishi() {
		System.out.println("已经产生5个不重复的大写字母");
		System.out.println("猜猜这5个字母");
	}
	@Override
	public String biDui(String c, String r) {
		/*
		 * 		a=1,b=1
		 *  r "KUHYW"
		 *  	j
		 *  c "HUWYX"
		 *     i
		 *  
		 */
		int a = 0;
		int b = 0;
		//i循环访问c字符串
		for (int i = 0; i < 5; i++) {
			//j循环访问r字符串
			for (int j = 0; j < 5; j++) {
				if (c.charAt(i)==r.charAt(j)) {
					//i和j位置的字符相等
					if (i==j) {
						a++;
					}else {
						b++;
					}
					break;
				}
			}
		}
		return a+"A"+b+"b";
	}
	@Override
	public boolean caiDui(String result) {
		return "5A0B".equals(result);
	}
	
	
	
	
}
