package test;

import java.lang.reflect.Method;

import org.junit.Test;

import javase.spring.pojo.Dept;
import javase.spring.pojo.Employee;

public class TestDI {
	@Test
	public void relationSpring() throws Exception {
		//���÷����ȡ����,ͨ���ص�invoke��ʽ,set�����Ѷ����������
		/*
		 * ��������:
		 * 1.ͨ��class��ȡ����,forName(className)
		 * 2.ͨ������󴴽�����ʵ��newInstance()
		 * 3.���÷����ṩ��set�������ö���Ĺ���
		 */
		//�������Ŷ���
		Class<?> clazz = Class.forName("javase.spring.pojo.Dept");
		//����ʵ������
		Dept dept = (Dept) clazz.newInstance();
		dept.setId(1);
		dept.setName("tony");
		System.out.println(dept);
		
		Class<?> clazzEmp = Class.forName("javase.spring.pojo.Employee");
		Employee emp = (Employee)clazzEmp.newInstance();
		emp.setId(8);
		emp.setName("anny");
		emp.setAge(18);
		
		System.out.println(emp);
		
		//ͨ�������ȡ���������з���,ָ������
		Method[] ms = clazzEmp.getDeclaredMethods();
		for (Method m : ms) {
			System.out.println(m.getName());
		}
		
		System.out.println("============");
		//��ȡָ���ķ���setDept
		Method m = clazzEmp.getDeclaredMethod("setDept", Dept.class);
		System.out.println(m.getName());
		
		//�ص�invoke,��һ��������ָ���ĸ�����ص����ķ���
		m.invoke(emp, dept);//emp.setDept(dept)
		
		System.out.println(emp);
		
		
		
	}
	
	
	@Test
	public void relation() {
		/*
		 * ����Dept,Ա��Employee
		 * ��ϵ:Ա����������
		 * ��java�����ʾ����֮���ϵ,�󶨹�ϵ
		 */
	
		Dept dept =new Dept();
		dept.setId(1);
		dept.setName("�����");
		
		Employee emp = new Employee();
		emp.setId(17);
		emp.setName("tony");
		emp.setAge(18);
		
		//�󶨹�ϵ
		emp.setDept(dept);
		
		System.out.println(emp.toString());
		
		
	}
	
	
}
