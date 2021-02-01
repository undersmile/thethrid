package json.Day11.json;

import com.alibaba.fastjson.JSON;

public class TestStuToJson {
public static void main(String[] args) {
	Student stu=new Student("李东华", 21, "440823****0345");
	String jsonString = JSON.toJSONString(stu);
	System.out.println(jsonString);
	//System.out.println("jsonString是字符串吗："+(jsonString instanceof String));
	System.out.println(stu);
	// = new Student("赵信", 26, "440856****3418");
	Student stu2 = JSON.parseObject(jsonString, Student.class);
	System.out.println("stu2:"+stu2);
}
}
