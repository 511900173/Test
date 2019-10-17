package javase.util;

import java.io.File;

import org.junit.Test;

//����Ŀ¼,��ӡ���е��ļ�
public class RecesionDir {
	/*
	 * ��������: 1.����һ���̶���Ŀ¼,Ȼ�������ļ������ṩapiת�� 
	 * 2.�ж��Ƿ�Ϊ��Ŀ¼,������ļ������ 
	 * 3.�ж����ļ�����Ŀ¼,������ļ�ֱ�����
	 * 4.����ж���Ŀ¼,��������,(����·��,��ǰĿ¼),�����г��� 
	 * 5.�������
	 */

	@Test
	public void testRecursion() {
		String dir = "E:\\eclipse-workspace\\day16 javase\\bin\\";
		this.readClassName(dir);
	}

	// ������:����ָ��Ŀ¼�µ�������Ŀ¼���ļ�
	public void readClassName(String dir) {
		File file = new File(dir);// �����ļ�����(Ŀ¼)
		File[] files = file.listFiles();// ��ȡ��ǰĿ¼�µ�������Ŀ¼���ļ�.�ص�,�����ȡ��Ŀ¼������
		if (null == files || files.length == 0) {// �жϵ�ǰĿ¼������û������
			System.out.println("��Ŀ¼Ϊ��");
		} else {// ��ǰĿ¼��������
			for (File f : files) {// ������ǰĿ¼�µ�����
				if (f.isDirectory()) {// ��Ŀ¼
					System.out.println("������Ŀ¼:" + f.getAbsolutePath());
					readClassName(f.getAbsolutePath());// �ݹ�,��������,����ֵҪ�仯
				} else {// �ļ�
					System.out.println(f.getAbsolutePath());
					FileUtil fu = new FileUtil();
					String s = fu.getClassName(f.getAbsolutePath());
					System.out.println(s);
					String beanname = fu.getBeanName(s);
					System.out.println(beanname);
					String c = fu.toFirstLower(beanname);
					System.out.println(c);
				}
			}
		}

	}

}
