package Text11;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

/*
 * 二分法插入一组有序数
 */
public class Twofen {
	@Test
	public void qqq() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 11, 22, 33, 44, 55);
		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Collections.addAll(list2, 5, 15, 25, 35, 45, 65);
		System.out.println(list2);
		for(int i = 0; i<list2.size() ; i++) {
			int index = Collections.binarySearch(list, list2.get(i));
			if (index >= 0) {
				list.add(index, list2.get(i));
			} else {
				list.add(-index - 1, list2.get(i));
			}
		}
		System.out.println(list);
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		Collections.addAll(list3, 8,18, 28, 38, 48, 58);
		for (Integer i2 : list3) {
			int n = Collections.binarySearch(list, i2);
			if (n>=0) {
				list.add(n, i2);
			}else {
				list.add(-n-1, i2);
			}
		}
		System.out.println(list);
	}
}







