package day1301�쳣;


import java.util.Scanner;

public class Text3 {
	public static void main(String[] args) {
		System.out.println("�û���");
		String n = new Scanner(System.in).nextLine();
		System.out.println("����");
		String p = new Scanner(System.in).nextLine();
		try {
			//��½����������û��������Ƿ���ȷ
			login(n,p);
			System.out.println("��ӭ��¼");
		} catch (UsernameNotFoundException e) {
			System.out.println("�û�������");
		}catch (WrongPasswordException e) {
			System.out.println("�������");
		}
	}

	private static void login(String n, String p) throws UsernameNotFoundException,WrongPasswordException{
		// abc 123
		if (!n.equals("abc")) {
			throw new UsernameNotFoundException();
		}
		if (!p.equals("123")) {
			throw new WrongPasswordException();
		}
	}
}
