package day1202��ϣ��;

import java.util.HashMap;

public class Text3 {
	public static void main(String[] args) {
		Point a = new Point(1, 3);
		Point b = new Point(2, 5);
		//
		//���ܼ��㲻ͬ�±�λ��
		//���ܼ�����ͬ�±�λ�ã���������������һ��
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		HashMap<Point, String> map = new HashMap<Point, String>();
		map.put(a, "3.1��");
		map.put(b, "4.5��");
		System.out.println(map);
		
		Point c = new Point(1, 3);
		//����c�㣬��Ӧ�����۶�"3.05��"
		map.put(c, "3.05��");
		System.out.println(map);
		
		//��ͬ�Ĺ�ϣֵ�����ܱ�֤������ͬ���±�
		System.out.println(a.hashCode());
		System.out.println(c.hashCode());
		
		//��ʹ�������ͬλ�ã�equals()Ҳ�������
		System.out.println(a.equals(c));
		
		
		
	}
	
	
}
