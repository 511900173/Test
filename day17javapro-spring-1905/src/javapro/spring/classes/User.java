package javapro.spring.classes;

import javapro.annotation.Autowried;

public class User {
	private String name = "pony";
	@Autowried
	private Dept dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", dept=" + dept + "]";
	}
	
	
	
}
