package test.xml;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class TestDom4j {
	@Test
	public void dom4j4() throws Exception {
		/*
		 * 1.����dom4j���߰� 2.��λ��ǰ�����ڵ�Ŀ¼,Ȼ��õ�OrderMapper.xmlӳ���ļ� 3.������������SAXReader 4.��ȡ��Ԫ��
		 * 5.��ȡ�����Ԫ�� 6.���������ӡ�������� 7.��ǩ����
		 */
		String id = "delete";
		System.out.println("���ݱ�ǩidֵ��ȡ��ǩ�е�SQL���:"+id);
		
		
		// ���ַ���,��ȡ��ǰ������·��
		String dir = this.getClass().getResource("").getPath();
		String filename = dir + "OrderMapper.xml";

		SAXReader reader = new SAXReader();
		InputStream in = new FileInputStream(filename);
		Document doc = reader.read(in); // xml�ļ�
//		System.out.println(doc.asXML());

		// ��ȡ��Ԫ��
		Element root = doc.getRootElement();

		// ��Ԫ�ص�������һ������
		Iterator<Element> it0 = root.elementIterator();
		while (it0.hasNext()) {
			// ��ȡһ������
			Element ele = it0.next();
//			System.out.println(ele.getName());
//			System.out.println(ele.getStringValue());

			// ��ȡÿ��id������
			Iterator<Attribute> it1 = ele.attributeIterator();
			while (it1.hasNext()) {
				Attribute attr = it1.next();
//					System.out.println("����:"+attr.getName());
//					System.out.println("����ֵ:"+attr.getValue());
				if (id.equals(attr.getValue())) {
					System.out.println("SQL���:"+ele.getStringValue().trim());
				}
			}

		}

	}
}
