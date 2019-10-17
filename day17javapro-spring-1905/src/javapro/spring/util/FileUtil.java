package javapro.spring.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class FileUtil {
	/*
	 * 开发步骤 1.已经知道一个固定的目录 2.去掉基准路径,bin/之前的内容 3.去掉.class 4.\斜杠替换成.点
	 */
	
	public void testClassName() {
		FileUtil fu = new FileUtil();
		String fileNamePath = "E:\\eclipse-workspace\\day01\\bin\\com\\tedu\\hello\\HelloWorld.class";
		System.out.println(fu.getClassName(fileNamePath));
	}
	public void testBeanName() {
		String className = "com.tedu.hello.HelloWorld";
		FileUtil fu = new FileUtil();
		String s = fu.getBeanName(className);
		System.out.println(s);
	}
	public void testFirst() {
		FileUtil fu = new FileUtil();
		String s = fu.toFirstLowwer("HelloWorld");
		System.out.println(s);
	}

	public String getBeanName(String className) {
		Integer pos = className.lastIndexOf(".");
		String s = className.substring(pos + 1);
		return s;
	}

	public String toFirstLowwer(String name) {
		char a = name.charAt(0);
		a = Character.toLowerCase(a);
		return a + name.substring(1);

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
	
	/*
	 * 第二个参数:容器(池) 每次递归会覆盖前一个就被丢掉了,必须提出去
	 */
	
	
	public void testRead() {
		FileUtil fu = new FileUtil();
		String packagePath = "E:\\eclipse-workspace\\day16 javase\\bin\\javase\\spring\\pojo";
		List<String> list = new ArrayList<String>();
		fu.readClassName(packagePath, list);
		for (String x : list) {
			System.out.println(x);
		}
	}
	
	
	public List<String> readClassName(String packagePath,List<String> list) {	
		File file = new File(packagePath);
		File[] files = file.listFiles();
		if (files.length > 0) {
			for (File f : files) {
				if (f.isDirectory()) {
					readClassName(f.getAbsolutePath(),list);// 递归,调用自身,参数值要变化
				} else {// 文件
					FileUtil fu = new FileUtil();
					String className = fu.getClassName(f.getAbsolutePath());
					list.add(className);
				}
			}
		}
		return list;
	}

}
