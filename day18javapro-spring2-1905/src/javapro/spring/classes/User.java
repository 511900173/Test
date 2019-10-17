package javapro.spring.classes;

public class User {
	private Integer id = 8;
	private String name = "anny";
	
	
	public Integer getIdInteger() {
		return id;
	}
	public void setIdInteger(Integer idInteger) {
		this.id = idInteger;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [idInteger=" + id + ", name=" + name + "]";
	}
	
}
