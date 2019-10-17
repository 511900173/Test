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
		
		//4.注入
		csp.inject();

		// beans.keySet();
		System.out.println("======================");
		for (String beanName : csp.beans.keySet()) {
			System.out.println(csp.beans.get(beanName));
		}

		Hello h = (Hello) csp.getBean("hello");
		h.hi();

		// 给员工设置部门关联,绑定关系
		// 1.获取员工
		Employee emp = (Employee) csp.getBean("employee");
		System.out.println(emp);

		// 2.获取部门
		Dept dept = (Dept) csp.getBean("dept");
		System.out.println(dept);

		// 3.绑定关系 invoke
		// 获取类
		Method m = emp.getClass().getDeclaredMethod("setDept", Dept.class);
		m.invoke(emp, dept);
		System.out.println(emp);

	}

	// 从容器中获取
	public Object getBean(String beanName) {
		return beans.get(beanName);
	}

	// 拿到目录下的所有的className,创建对象
	public void config(String packagePath) throws Exception {
		// 1.调用工具类获取所有的className
		FileUtil fu = new FileUtil();
		List<String> listClassName = new ArrayList<String>();
		fu.readClassName(packagePath, listClassName);

		System.out.println("包扫描:");
		for (String className : listClassName) {
			System.out.println(className);

			Class<?> clazz = Class.forName(className);

			Object instance = clazz.newInstance();

			String beanName = fu.toFirstLowwer(fu.getBeanName(className));
			System.out.println("beanName=" + beanName);
			beans.put(beanName, instance);
		}

	}

	// 依赖注入
	public void inject() throws Exception {
		// 1.遍历整个容器 map.beans
		for (String beanName : beans.keySet()) {
			// 2.获取每个对象,通过对象获取类
			Object instance = getBean(beanName);
			
			Class<?> clazz = instance.getClass();

			// 3.遍历类说有属性
			Field[] fs = clazz.getDeclaredFields();
			for (Field f : fs) {
				

				// 4.找指定的注解
				Autowried aw = f.getDeclaredAnnotation(Autowried.class);
				
				if (null != aw) {
					
					// 5.如果存在,绑定关系
					Object relationObject = getBean(f.getName());

					// 6.这是一个私有属性,告诉它我要调用
					f.setAccessible(true);//反射才可以把私有的进行访问
					f.set(instance, relationObject);

					System.out.println("当前对象实例" + instance.toString());
					System.out.println("当前属性名" + f.getName());
					System.out.println("属性对象实例" + relationObject);
				}

			}

		}

	}

}
