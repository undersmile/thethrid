package com.gcc.dto;

public class Student {
	private String name;
	private String sex;
	private Integer age;
	private String passwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Student(String name, String sex, Integer age, String passwd) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.passwd = passwd;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + ", passwd=" + passwd + "]";
	}
	
}
