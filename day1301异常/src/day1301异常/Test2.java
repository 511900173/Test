package day1301�쳣;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Test2 {
	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, "2019-6-22", "2019-6-1", "2019-6-2", "2019-6-19", "2019-6-10", "2019-6-21",
				"2019-6-3");
		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// String --- SimpleDateFormat--Date
				// �������ڸ�ʽ�Ĺ���
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				try {
					// �ø�ʽ���߶�o1�ַ������н��£����³�Dateʵ��
					Date d1 = sdf.parse(o1);
					Date d2 = sdf.parse(o2);
					return d1.compareTo(d2);
				} catch (ParseException e) {
					// һ�㲶���쳣��Ҫ�����޸�
					// ���Ǵ˴�����������쳣���������׳�ȥ
					// main() -- f() -- sort() -- compare()
					throw new RuntimeException(e);
				}
			}
		});
		System.out.println(list);

	}
}
