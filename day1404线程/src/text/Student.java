package text;

public class Student {
	private int id;
	private int age;
	private String name;
	private String gender;


	@Override
	public int hashCode() {
		final int p = 31;
		int r = 1;
		r = r*p+id;
		r = r*p+age;
		r = r*p+name.hashCode();
		r = r*p+gender.hashCode();
		return r;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student s= (Student) obj;
		if ( id!= s.id)
			return false;
		if ( age!= s.age)
			return false;
		if ( name!= s.name)
			return false;
		if ( gender!= s.gender)
			return false;
		return true;
	}
	
	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (age != other.age)
//			return false;
//		if (gender == null) {
//			if (other.gender != null)
//				return false;
//		} else if (!gender.equals(other.gender))
//			return false;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	public Student() {
	
	}
	public Student(int id, int age, String name, String gender) {
	
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
