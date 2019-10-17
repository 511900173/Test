package com.tedu.guess01������;

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
		// iѭ����λǰ5��λ��
		for (int i = 0; i < 5; i++) {
			// [i,26)
			// i + [0,26-i) �����λjλ��
			int j = i + new Random().nextInt(26-i);
			// ����i,jλ�õ��ַ�
			char t = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, t);
		}
		//ɾ��[5,26)
		sb.delete(5, 26);
		System.out.println(sb);
		return sb.toString();//��sb�е��ַ�������String
	}
	@Override
	public void tishi() {
		System.out.println("�Ѿ�����5�����ظ��Ĵ�д��ĸ");
		System.out.println("�²���5����ĸ");
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
		//iѭ������c�ַ���
		for (int i = 0; i < 5; i++) {
			//jѭ������r�ַ���
			for (int j = 0; j < 5; j++) {
				if (c.charAt(i)==r.charAt(j)) {
					//i��jλ�õ��ַ����
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
