package day1202哈希表;

import java.util.HashMap;
import java.util.Scanner;

public class Text2 {

	public static void main(String[] args) {
		System.out.println("输入字符串");
		String s = new Scanner(System.in).nextLine();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//去字符对应的计数值
			//count 可能是null，或者计数值
			Integer count = map.get(c);
			if (count==null) {//还没有奇数
				map.put(c, 1);//这时第一个字符
			}else {
				map.put(c, count+1);
			}
		}

			System.out.println(map);
	
		
	}
}
