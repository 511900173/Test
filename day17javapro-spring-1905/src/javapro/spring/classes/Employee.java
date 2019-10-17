package javapro.spring.classes;

import javapro.annotation.Autowried;

public class Employee {
	@Autowried
	private Dept dept; //À˘ Ù≤ø√≈
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	private Integer id = 1;
	private String name = "tony";
	private Integer age = 18 ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
