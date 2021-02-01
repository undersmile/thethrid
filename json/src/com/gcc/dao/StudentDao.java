package com.gcc.dao;

import java.util.List;

import com.gcc.dto.Student;

public interface StudentDao {
	public List<Student> FindAll();
	public void SelectStudent(List<Student> stus);
	public void UpdateStudent(List<Student> stus,String name,String newname);
	public void DeleteStudent(List<Student> stus,String name);
}
