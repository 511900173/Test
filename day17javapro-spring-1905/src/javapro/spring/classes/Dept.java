package javapro.spring.classes;

public class Dept {
	private Integer id = 1;//null �Ƽ�ʹ�ð�װ����
	private String name = "�����";
	
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
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + "]";
	}
	
}
