package day1401;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("g:/abc/f2"));
		Student stu = (Student) in.readObject();
		System.out.println(stu);
		in.close();

	}

}
