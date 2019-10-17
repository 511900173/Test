package javase.util;

import org.junit.Test;

public class FileUtil {
	/*
	 * 开发步骤 1.已经知道一个固定的目录 2.去掉基准路径,bin/之前的内容 3.去掉.class 4.\斜杠替换成.点
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
		
		// \在java世界里代表转义字符,不是分隔符斜杠的意思,\\最终代表一个斜杠
//		String fileNamePath = "E:\\eclipse-workspace\\day01\\bin" 
//						+ "\\com\\tedu\\hello\\HelloWorld.class";
		// 把bin目录前的内容都删除,api定位bin位置,利用indexof("\\bin")
		// 截取字符串substring()
		Integer pos = fileNamePath.indexOf("bin");
		String s = fileNamePath.substring(pos + 4);
		s = s.substring(0, s.length() - 6);
		s = s.replaceAll("\\\\", "\\.");
		return s;

	}
}
