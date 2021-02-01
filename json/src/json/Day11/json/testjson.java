package json.Day11.json;

import java.util.StringJoiner;

public class testjson {
public static void main(String[] args) {
	StringJoiner sj = new StringJoiner(",", "{", "}") ;
	String str = "\"name:\"汪洋\"";
	sj.add(str);
	System.out.println(sj);
	//StringJoiner构造特殊的字符串，三个参数为分隔，前缀，后缀
	
}
}
