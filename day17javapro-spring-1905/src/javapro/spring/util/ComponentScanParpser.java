package javapro.spring.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import javapro.annotation.Autowried;
import javapro.spring.classes.Dept;
import javapro.spring.classes.Employee;
import javapro.spring.classes.Hello;
import javapro.spring.util.FileUtil;

public class ComponentScanParpser {

	private Map<String, Object> beans = new HashMap<String, Object>();

	@Test
	public void testConfig() throws Exception {
		
		ComponentScanParpser csp = new ComponentScanParpser();
		
		
		String packagePath = "E:\\eclipse-workspace\\javapro-spring-1905\\bin\\javapro\\spring\\classes";
		csp.config(packagePath);
		
		//4.ע��
		csp.inject();

		// beans.keySet();
		System.out.println("======================");
		for (String beanName : csp.beans.keySet()) {
			System.out.println(csp.beans.get(beanName));
		}

		Hello h = (Hello) csp.getBean("hello");
		h.hi();

		// ��Ա�����ò��Ź���,�󶨹�ϵ
		// 1.��ȡԱ��
		Employee emp = (Employee) csp.getBean("employee");
		System.out.println(emp);

		// 2.��ȡ����
		Dept dept = (Dept) csp.getBean("dept");
		System.out.println(dept);

		// 3.�󶨹�ϵ invoke
		// ��ȡ��
		Method m = emp.getClass().getDeclaredMethod("setDept", Dept.class);
		m.invoke(emp, dept);
		System.out.println(emp);

	}

	// �������л�ȡ
	public Object getBean(String beanName) {
		return beans.get(beanName);
	}

	// �õ�Ŀ¼�µ����е�className,��������
	public void config(String packagePath) throws Exception {
		// 1.���ù������ȡ���е�className
		FileUtil fu = new FileUtil();
		List<String> listClassName = new ArrayList<String>();
		fu.readClassName(packagePath, listClassName);

		System.out.println("��ɨ��:");
		for (String className : listClassName) {
			System.out.println(className);

			Class<?> clazz = Class.forName(className);

			Object instance = clazz.newInstance();

			String beanName = fu.toFirstLowwer(fu.getBeanName(className));
			System.out.println("beanName=" + beanName);
			beans.put(beanName, instance);
		}

	}

	// ����ע��
	public void inject() throws Exception {
		// 1.������������ map.beans
		for (String beanName : beans.keySet()) {
			// 2.��ȡÿ������,ͨ�������ȡ��
			Object instance = getBean(beanName);
			
			Class<?> clazz = instance.getClass();

			// 3.������˵������
			Field[] fs = clazz.getDeclaredFields();
			for (Field f : fs) {
				

				// 4.��ָ����ע��
				Autowried aw = f.getDeclaredAnnotation(Autowried.class);
				
				if (null != aw) {
					
					// 5.�������,�󶨹�ϵ
					Object relationObject = getBean(f.getName());

					// 6.����һ��˽������,��������Ҫ����
					f.setAccessible(true);//����ſ��԰�˽�еĽ��з���
					f.set(instance, relationObject);

					System.out.println("��ǰ����ʵ��" + instance.toString());
					System.out.println("��ǰ������" + f.getName());
					System.out.println("���Զ���ʵ��" + relationObject);
				}

			}

		}

	}

}
