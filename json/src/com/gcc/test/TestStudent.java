package com.gcc.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gcc.dao.StudentDao;
import com.gcc.dao.impl.StudentDaoImpl;
import com.gcc.dto.Student;

public class TestStudent {
	public static void main(String[] args) {
		List<Student> stusList = new ArrayList<>();
		StudentDao sd = new StudentDaoImpl();
		Scanner in = new Scanner(System.in);
		stusList = sd.FindAll();
		System.out.println("打印所有学生信息");
		stusList.forEach(s -> System.out.println(s));
		System.out.println();
		System.out.println("查询性别为男的学生");
		sd.SelectStudent(stusList);
		System.out.println();
	System.out.println("请输入要修改的学生姓名：");
	String oldname=in.next();
	System.out.println("请输入修改后的学生姓名：");
	String newname=in.next();
	sd.UpdateStudent(stusList, oldname, newname);
	stusList = sd.FindAll();
	System.out.println("修改后的所有学生信息");
	stusList.forEach(s->System.out.println(s));

//		System.out.println("请输入要删除的学生姓名：");
//		String name = in.next();
//		sd.DeleteStudent(stusList, name);
//		System.out.println("删除后的所有学生信息");
//		stusList = sd.FindAll();
//		stusList.forEach(s -> System.out.println(s));

	}
}
