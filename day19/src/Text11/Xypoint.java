package Text11;

import java.util.HashMap;

import org.junit.Test;

public class Xypoint {
	@Test
	public  void test() {
		Point a = new Point(1,3);
		Point b = new Point(2,5);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		HashMap<Point, String> map = new HashMap<Point, String>();
		
		HashMap<String,String> map2 =new HashMap<>();
//		map.put("ʮһ", "11");
		
		map.put(a, "3.1yi");
		map.put(b, "5.5yi");
		System.out.println(map);
		
		Point c = new Point(1,3);
		System.out.println(c.hashCode());
		Point d = new Point(1,4);
		System.out.println(d.hashCode());
		System.out.println(c.equals(a));
		map.put(c, "8.8yi");
		System.out.println(map);
		
	}
	
	
}
