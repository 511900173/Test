package day16text;

import org.junit.Test;

public class FileUtil {
	@Test
	public void test() {
		FileUtil fu = new FileUtil();	
		String path = "E:\\eclipse-workspace\\day16 javase\\bin\\javase\\util\\FileUtil.class";
		String name = this.toFirstLower(this.getBeanName(this.getClassName(path)));
		System.out.println(name);
	}
	
	//@Test �������ַ������ȫ
	public String getClassName(String fileNamePath) {
		//String fileNamePath = "E:\\eclipse-workspace\\day16 javase\\bin\\javase\\util\\FileUtil.class";
		Integer pos = fileNamePath.indexOf("bin");
		String s = fileNamePath.substring(pos+4);
		s = s.substring(0, s.length()-6);
		s = s.replaceAll("\\\\", "\\.");
		return s;
	}
	//@Test ����������������
	public String getBeanName(String className) {
		//String className = "javase.util.FileUtil";
		Integer pos = className.lastIndexOf(".");
		String s = className.substring(pos+1);
		return s;
	}
	//@Test ����������ĸת����Сд
	public String toFirstLower(String  beanName) {
		//String  beanName = "FileUtil";
		char s = beanName.charAt(0);
		s = Character.toLowerCase(s);
		String a = s + beanName.substring(1);
		return a;
		
	}
	
	
	
}
