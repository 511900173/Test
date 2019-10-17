package test;

import java.lang.annotation.Annotation;

import org.junit.Test;

import javase.spring.annotation.Controller;
import javase.spring.annotation.Service;

public class TestRelect {
	//��ȡ���ϵ�ע��
	//�쳣
	@Test
	public void testControllerAnnotation() throws Exception {
		//��ȡhello.class�ϵ�����ע��
		//<����>��ʶ������е�Ԫ������,?ͨ���
		Class<?> clazz = Class.forName("javase.spring.pojo.Hello");
		
		//�����ṩ��ȡ���ϵ�����ע��
		Annotation[] as = clazz.getDeclaredAnnotations();
		//����
		for (Annotation a : as) {
			System.out.println(a.toString());
		}
		
		//��ȡ@Controllerע��
		Controller c = clazz.getAnnotation(Controller.class);
		System.out.println(c.value());
		
		Service s = clazz.getAnnotation(Service.class);
		System.out.println(s.value());
	}
}




















