package day1203collections������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Text2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("���س�����ֵ");
		while (true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(100);
			// ȷ�������
			// �ҵ����õ�r���±�λ�ã����ǲ����
			// �Ҳ������õ�-(�����+1)
			int index = Collections.binarySearch(list, r);
			if (index >= 0) {
				list.add(index, r);
			} else {
				list.add(-index - 1, r);
			}
			System.out.println(list);

		}

	}

}
