package day1202��ϣ��;

import java.util.HashMap;
import java.util.Scanner;

public class Text2 {

	public static void main(String[] args) {
		System.out.println("�����ַ���");
		String s = new Scanner(System.in).nextLine();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//ȥ�ַ���Ӧ�ļ���ֵ
			//count ������null�����߼���ֵ
			Integer count = map.get(c);
			if (count==null) {//��û������
				map.put(c, 1);//��ʱ��һ���ַ�
			}else {
				map.put(c, count+1);
			}
		}

			System.out.println(map);
	
		
	}
}
