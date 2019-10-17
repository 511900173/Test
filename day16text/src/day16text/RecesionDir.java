package day16text;

import java.io.File;

import org.junit.Test;

public class RecesionDir {
	@Test
	public void testRecesion() {
		String dir = "E:\\eclipse-workspace\\day16 javase\\bin";
		this.readClassName(dir);
		
	}
	
	
	public void readClassName(String dir) {
		File f = new File(dir);
		File[] files = f.listFiles();	
		if (null == files || files.length==0) {
			System.out.println("此目录为空");
		}
		for (File a : files) {
			if (a.isDirectory()) {
				System.out.println("遍历子目录"+a.getAbsolutePath());
				readClassName(a.getAbsolutePath());
			}else {
				System.out.println(a.getAbsolutePath());
				FileUtil fu = new FileUtil();
				System.out.println(fu.toFirstLower(fu.getBeanName(fu.getClassName(a.getAbsolutePath()))));
			}
		}
		
	}
	


}
