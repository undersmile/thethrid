package json.Day11.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJackson {

	public static void main(String[] args) throws IOException {
		Student stu = new Student();
		stu.setName("王阳");
		stu.setCardID("275465****4587");
		stu.setAge(21);
		
		//创建json对象
		/*
		 * ObjectMapper 是整个JSON操作的核心类
		   writeValue(File file,Object):序列化到文件中
		   writeValueAsString：写到字符串
		 */
		ObjectMapper objMapper = new ObjectMapper();
		String json = objMapper.writeValueAsString(stu);
		System.out.println("json:" + json);
		
		//把json String转成Student对象
		Student stuObj = objMapper.readValue(json, Student.class);
		System.out.println("stu对象:" + stuObj);
		
		//把学生对象放入集合
		List<Student> stus = new ArrayList<>();
		stus.add(stu);
		
		//把集合转成jsonString
		String listString = objMapper.writeValueAsString(stus);
		System.out.println("listString:" + listString);
		
		//写到文件中
		objMapper.writeValue(new File("c:\\users\\administrator\\desktop\\stu.txt"), stu);
		//读取文件转成Student对象
		Student stu2 = objMapper.readValue(new File("c:\\users\\administrator\\desktop\\stu.txt"), Student.class);
		System.out.println(stu2);
	}

}
