package json.Day11.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

public class TestListToArray {
public static void main(String[] args) {
	List<Student> list = new ArrayList<Student>();
	Student t1  =new Student("李东华", 21, "440823****0345");
	Student t2  =new Student("张三", 28, "441726****1525");
	Student t3  =new Student("李四", 37, "441233****4659");
	Student t4  =new Student("赵五", 16, "441216****1234");
	Student t5  =new Student("韩六", 28, "441845****2615");
	list.add(t1);
	list.add(t2);
	list.add(t3);
	list.add(t4);
	list.add(t5);
	String jsonString = JSON.toJSONString(list);
	System.out.println(jsonString);
	List<Student> list2 = JSON.parseArray(jsonString,Student.class);
	System.out.println("************************");
	list2.forEach(stu->System.out.println(stu));
}
}
