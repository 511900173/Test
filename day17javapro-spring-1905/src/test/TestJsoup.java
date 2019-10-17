package test;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class TestJsoup {
	@Test //ץȡ�۸�,ajax����ץȡ price J-p-24500013193
	public void getPrice() throws Exception {
		String url = "https://p.3.cn/prices/mgets?skuIds=J_24500013193";
		//ֱ�ӻ�ȡ�����е�����
		String s = Jsoup.connect(url).ignoreContentType(true).execute().body();
		System.out.println(s);
		
	}
	
	@Test //ץȡҳ����Ϣ
	public void getINfo() throws Exception {
		//Ҫ���ʵ�ҳ��
		String url = "https://item.jd.com/24500013193.html";
		
		//1.��������,�൱��socket
		Connection cn = Jsoup.connect(url);
		
		//2.��ȡ����ҳ��
		Document doc = cn.get();
		//<p class="bjh-p">..</p> ����:��class=""����ǰ��ӵ�
		Elements els = doc.select(".price J-p-24500013193");//������ҳ����������ǩ,��ȡ����
		for (Element e : els) {
			String info = e.text();
			System.out.println(info);
			
		}			
	}
}
