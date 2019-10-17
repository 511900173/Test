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
		 * 1.导入dom4j工具包 2.定位当前类所在的目录,然后得到OrderMapper.xml映射文件 3.创建解析对象SAXReader 4.获取根元素
		 * 5.获取里面的元素 6.遍历数组打印所有属性 7.标签属性
		 */
		String id = "delete";
		System.out.println("根据便签id值获取标签中的SQL语句:"+id);
		
		
		// 空字符串,获取当前类所在路径
		String dir = this.getClass().getResource("").getPath();
		String filename = dir + "OrderMapper.xml";

		SAXReader reader = new SAXReader();
		InputStream in = new FileInputStream(filename);
		Document doc = reader.read(in); // xml文件
//		System.out.println(doc.asXML());

		// 获取根元素
		Element root = doc.getRootElement();

		// 根元素的内容是一个集合
		Iterator<Element> it0 = root.elementIterator();
		while (it0.hasNext()) {
			// 获取一个处理
			Element ele = it0.next();
//			System.out.println(ele.getName());
//			System.out.println(ele.getStringValue());

			// 获取每个id的属性
			Iterator<Attribute> it1 = ele.attributeIterator();
			while (it1.hasNext()) {
				Attribute attr = it1.next();
//					System.out.println("属性:"+attr.getName());
//					System.out.println("属性值:"+attr.getValue());
				if (id.equals(attr.getValue())) {
					System.out.println("SQL语句:"+ele.getStringValue().trim());
				}
			}

		}

	}
}
