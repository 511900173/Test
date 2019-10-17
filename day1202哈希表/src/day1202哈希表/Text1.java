package day1202哈希表;

import java.util.HashMap;

public class Text1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(9527, "唐伯虎");
		map.put(9528, "华夫人");
		map.put(9529, "祝枝山");
		map.put(9530, "旺财");
		map.put(9531, "小强");
		map.put(9532, "石榴姐");
		map.put(9533, "秋香");
		map.put(9534, "如花");
		map.put(9535, null);
		map.put(null, "---");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(9527));
		System.out.println(map.get(9999));
		System.out.println(map.remove(9531));
		System.out.println(map);
		
		
	}
}
