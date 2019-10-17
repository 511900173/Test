package javapro.spring.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class FileUtil {
	/*
	 * �������� 1.�Ѿ�֪��һ���̶���Ŀ¼ 2.ȥ����׼·��,bin/֮ǰ������ 3.ȥ��.class 4.\б���滻��.��
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
	
	/*
	 * �ڶ�������:����(��) ÿ�εݹ�Ḳ��ǰһ���ͱ�������,�������ȥ
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
					readClassName(f.getAbsolutePath(),list);// �ݹ�,��������,����ֵҪ�仯
				} else {// �ļ�
					FileUtil fu = new FileUtil();
					String className = fu.getClassName(f.getAbsolutePath());
					list.add(className);
				}
			}
		}
		return list;
	}

}
