package day1202��ϣ��;

import java.util.HashMap;

public class Text1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(9527, "�Ʋ���");
		map.put(9528, "������");
		map.put(9529, "ף֦ɽ");
		map.put(9530, "����");
		map.put(9531, "Сǿ");
		map.put(9532, "ʯ���");
		map.put(9533, "����");
		map.put(9534, "�绨");
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
