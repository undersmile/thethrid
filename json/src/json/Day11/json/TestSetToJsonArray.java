package json.Day11.json;

import java.util.HashSet;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

public class TestSetToJsonArray {
public static void main(String[] args) {
	Set<Student> stus = new HashSet<>();
	Student t1  =new Student("李东华", 21, "440823****0345");
	Student t2  =new Student("张三", 28, "441726****1525");
	Student t3  =new Student("李四", 37, "441233****4659");
	Student t4  =new Student("赵五", 16, "441216****1234");
	Student t5  =new Student("韩六", 28, "441845****2615");
	stus.add(t1);
	stus.add(t2);
	stus.add(t3);
	stus.add(t4);
	stus.add(t5);
	String jsonString = JSON.toJSONString(stus);
	System.out.println("jsonString"+jsonString);
	System.out.println("***************************************");
	Set<Student> set = (Set<Student>) JSON.parseObject(jsonString);
	set.forEach(s->{System.out.println(s);});
}
}
