package test;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javapro.spring.classes.Dept;

public class TestJson {
	//ȫ��Ψһ�ĳ���
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	/*
	 * 1.��java����ת����
	 */
	@Test
	public void toJson() throws Exception {
		Dept dept = new Dept();
		dept.setId(7);
		dept.setName("ղķ˹���");
		System.out.println(dept);
		String Josn = MAPPER.writeValueAsString(dept);
		System.out.println(Josn);
		
	}

	//2.��json�ַ���ת��java����(�����л�)
	@Test
	public void toJava() throws Exception {
		String json = "{\"id\":7,\"name\":\"ղķ˹���\"}";//��������	
		Dept dept = MAPPER.readValue(json, Dept.class);
		System.out.println(dept);
		
	}
	
	
	//3.���������۸�json��,��ȡĳ����Ʒ�۸�
	@Test
	public void getPrice() throws Exception {
		String json = "[{\"cbf\":\"0\",\"id\":\"J_24500013193\",\"m\":\"50000.00\",\"op\":\"21999.00\",\"p\":\"21999.00\"},{\"cbf\":\"0\",\"id\":\"J_24500013193\",\"m\":\"50000.00\",\"op\":\"21999.00\",\"p\":\"99999.00\"}]";
		//json�ص�:����.��һ����¼,�������¼�л�ȡkey=p,�õ�21999
		//1.��ȡ����,���ؽ��ͨ������
		JsonNode node = MAPPER.readTree(json); // ��һ������
		JsonNode node1 = node.get(1); //����ĵ�һ����¼
		JsonNode price = node1.get("p"); // ĳ����¼�л�ȡ����Ϊp��ֵ
		String s = price.asText();
		System.out.println(price.asDouble());
		
		
		
	}
	
	
	
	
}




















