package javase.util;

import org.junit.Test;

public class FileUtil {
	/*
	 * �������� 1.�Ѿ�֪��һ���̶���Ŀ¼ 2.ȥ����׼·��,bin/֮ǰ������ 3.ȥ��.class 4.\б���滻��.��
	 */
	
	public static void main(String[] args) {}

	@Test
	public void testClassName() {
		FileUtil fu = new FileUtil();
		String fileNamePath = "E:\\eclipse-workspace\\day01\\bin" 
				+ "\\com\\tedu\\hello\\HelloWorld.class";
		System.out.println(fu.getClassName(fileNamePath));
	}
	
	@Test
	public void testBeanName() {
		String className = "com.tedu.hello.HelloWorld";
		FileUtil fu = new FileUtil();
		String s = fu.getBeanName(className);
		System.out.println(s);
	}
	
	public String getBeanName(String className) {
		Integer pos = className.lastIndexOf(".");
		String s = className.substring(pos+1);
		return s;
	}
	
	@Test
	public void testFirst() {
		FileUtil fu = new FileUtil();
		String s = fu.toFirstLower("HelloWorld");
		System.out.println(s);
	}
	
	public String toFirstLower(String name) {
		char a = name.charAt(0);
		a = Character.toLowerCase(a);
		return a+name.substring(1);
		
	}
	
	public String getClassName(String fileNamePath) {
		
		// \��java���������ת���ַ�,���Ƿָ���б�ܵ���˼,\\���մ���һ��б��
//		String fileNamePath = "E:\\eclipse-workspace\\day01\\bin" 
//						+ "\\com\\tedu\\hello\\HelloWorld.class";
		// ��binĿ¼ǰ�����ݶ�ɾ��,api��λbinλ��,����indexof("\\bin")
		// ��ȡ�ַ���substring()
		Integer pos = fileNamePath.indexOf("bin");
		String s = fileNamePath.substring(pos + 4);
		s = s.substring(0, s.length() - 6);
		s = s.replaceAll("\\\\", "\\.");
		return s;

	}
}
