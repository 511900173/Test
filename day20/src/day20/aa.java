package day20;

import java.util.ArrayList;

/*
 * 1.һ������,�ж������������ ,�ͷ�������ȥ
 * 2.дһ������ �ж�������,�ǵĻ�����true
 * 
 * 1.����100
 * 2.�ж���������Ƿ�������
 * 3.��������
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