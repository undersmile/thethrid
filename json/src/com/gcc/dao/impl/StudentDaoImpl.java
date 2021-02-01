package com.gcc.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.dom4j.Element;

import com.gcc.dao.StudentDao;
import com.gcc.dto.Student;
import com.gcc.util.XMLUtil;

public class StudentDaoImpl implements StudentDao {
	List<Element> stuElements = new ArrayList<>();
	XMLUtil xu = new XMLUtil();

	@Override
	public List<Student> FindAll() {
		List<Student> stus = new ArrayList<>();

		stuElements = xu.getElements(this);
		for (Element e : stuElements) {
			Student s = new Student();// 姓名性别年龄密码
			s.setName(e.elementText("name"));
			s.setSex(e.elementText("sex"));
			s.setAge(Integer.valueOf(e.elementText("age")));
			s.setPasswd(e.elementText("passwd"));
			stus.add(s);
		}
		return stus;
	}

	@Override
	public void SelectStudent(List<Student> stus) {
		stus.forEach(s -> {
			if (s.getSex().equals("男"))
				System.out.println(s);
		});
	}

	@Override
	public void UpdateStudent(List<Student> stus, String oldname, String newname) {
		stuElements = xu.getElements(this);
		for (Element e : stuElements) {
			if (e.element("name").getText().equals(oldname)) {
				e.element("name").setText(newname);
				try {
					xu.writexml(this);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public void DeleteStudent(List<Student> stus, String name) {
		stuElements = xu.getElements(this);
		for (Element e : stuElements) {
			if (e.element("name").getText().equals(name)) {
				e.remove(e.element("age"));
				try {
					xu.writexml(this);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
