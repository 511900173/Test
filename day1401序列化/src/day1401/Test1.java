package day1401;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		/*
		 * 把学生实例序列化 保存到文件f2
		 *
		 * f2文件上插一个文件输出流，和文件流相接(FOS)，再插一个序列化的输出流(OOS)
		 * 
		 * OOS--FOS--f2
		 */
		Student stu = new Student(9527, "唐伯虎", "男", 19);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("g:/abc/f2"));
		out.writeObject(stu);
		out.close();

	}

}
