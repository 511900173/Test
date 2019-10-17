package text;

import java.util.HashMap;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student(9527,18,"ÌÆ²®»¢","Å®");
		Student s2 = new Student(9528,20,"×£Ö¦É½","ÄÐ");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		HashMap<Student, String> map = new HashMap<>();
		map.put(s1, "100");
		map.put(s2, "150");
		System.out.println(map);
		Student s3 = new Student(9527,18,"ÌÆ²®»¢","Å®");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s3));
		map.put(s3, "200");
		System.out.println(map);
		
	}

}
