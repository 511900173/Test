package text16;

import java.util.Random;

public class GuessLetter extends GuessGame {

	@Override
	public String suiji() {
		StringBuffer s = new StringBuffer("qwertyuiopasdfghjklzxcvbnm");
		for (int i = 0; i < 5; i++) {
			int j = new Random().nextInt(26 - i) + i;
			char t = s.charAt(i);
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, t);
		}
		s.delete(5, 26);
		System.out.println(s);
		return s.toString();
	}

	@Override
	public void tishi() {
		System.out.println("已经生成随机5个字母");
	}

	@Override
	public String budui(String c, String r) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (c.charAt(i) == r.charAt(j)) {
					if (i == j) {
						a++;
					} else {
						b++;
					}
					break;
				}
			}
		}

		return a+"a"+b+"b";
	}

	@Override
	public boolean cidui(String result) {
		return "5a0b".equals(result);
	}

}
