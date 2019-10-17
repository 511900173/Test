package test;

import java.lang.reflect.Method;

import org.junit.Test;

import javase.spring.pojo.Dept;
import javase.spring.pojo.Employee;

public class TestDI {
	@Test
	public void relationSpring() throws Exception {
		//利用发射获取对象,通过回调invoke方式,set方法把对象关联起来
		/*
		 * 开发步骤:
		 * 1.通过class获取对象,forName(className)
		 * 2.通过类对象创建对象实例newInstance()
		 * 3.利用反射提供的set方法设置对象的关联
		 */
		//创建部门对象
		Class<?> clazz = Class.forName("javase.spring.pojo.Dept");
		//创建实例对象
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
		
		//通过反射获取这个类的所有方法,指定方法
		Method[] ms = clazzEmp.getDeclaredMethods();
		for (Method m : ms) {
			System.out.println(m.getName());
		}
		
		System.out.println("============");
		//获取指定的方法setDept
		Method m = clazzEmp.getDeclaredMethod("setDept", Dept.class);
		System.out.println(m.getName());
		
		//回调invoke,第一个参数是指对哪个对象回调他的方法
		m.invoke(emp, dept);//emp.setDept(dept)
		
		System.out.println(emp);
		
		
		
	}
	
	
	@Test
	public void relation() {
		/*
		 * 部门Dept,员工Employee
		 * 关系:员工所属部门
		 * 用java代码表示对象之间关系,绑定关系
		 */
	
		Dept dept =new Dept();
		dept.setId(1);
		dept.setName("软件部");
		
		Employee emp = new Employee();
		emp.setId(17);
		emp.setName("tony");
		emp.setAge(18);
		
		//绑定关系
		emp.setDept(dept);
		
		System.out.println(emp.toString());
		
		
	}
	
	
}
