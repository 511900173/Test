package day20;

import java.util.ArrayList;

public class bb {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 3; i < 100; i++) {
			int n=0;
			for (int j = 2; j < i-1; j++) {
				if (i%j == 0) {
					n = i;
					break;
				}
			}
			if (i!=n) {
				arr.add(i);
			}
		}
		System.out.println(arr);
	}
}
