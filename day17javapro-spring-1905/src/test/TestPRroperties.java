package test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class TestPRroperties {
	@Test
	public void prop() throws Exception {
		/*
		 * 1.��λ����ļ�
		 * 2.����һ���ļ��� FileInputStream
		 * 3.Properties prop���������ļ�����
		 * 4.prop.load(is) ��ȡ
		 * 5.��ӡpropչ����������
		 */
		
		//  /�����.../bin/��ʼ
		String dir = this.getClass().getResource("/").getPath();
		String filename = dir + "resources/jbdc.properties";
		InputStream is = new FileInputStream(filename);
		Properties prop = new Properties();
		prop.load(is); // �����ļ�һ���С,�����������ݶ����ڴ���
		is.close();
		System.out.println(prop);
		
		//��ȡ�����ض�ֵ
		String username = prop.getProperty("jdbc.username");
		System.out.println(username);
	}
}













