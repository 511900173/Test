package day1202哈希表;

import java.util.HashMap;

public class Text3 {
	public static void main(String[] args) {
		Point a = new Point(1, 3);
		Point b = new Point(2, 5);
		//
		//可能计算不同下标位置
		//可能计算相同下标位置，会用链表链接在一起
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		HashMap<Point, String> map = new HashMap<Point, String>();
		map.put(a, "3.1亿");
		map.put(b, "4.5亿");
		System.out.println(map);
		
		Point c = new Point(1, 3);
		//放入c点，对应的销售额"3.05亿"
		map.put(c, "3.05亿");
		System.out.println(map);
		
		//相同的哈希值，才能保证计算相同的下标
		System.out.println(a.hashCode());
		System.out.println(c.hashCode());
		
		//即使计算出相同位置，equals()也必须相等
		System.out.println(a.equals(c));
		
		
		
	}
	
	
}
