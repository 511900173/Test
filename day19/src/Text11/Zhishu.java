package Text11;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

/*
 * 100万以内的质数
 */
public class Zhishu {
	@Test
	public void zhiShu() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean boo;
		int k = 0;
		for (int i = 2; i < 100; i++) {
			boo = false;
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					boo = true;
					break;
				}
			}
			if (boo == false) {
				k++;
				list.add(i);
				System.out.print(i + " ");
				if (k % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.print(list);
	}

}
