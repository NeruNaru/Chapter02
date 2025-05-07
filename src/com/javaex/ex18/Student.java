package com.javaex.ex18;

public class Student {

	//field
	private String name;
	private int age;
	private String schoolName;
	
	//editor
	public Student() {
		
	}
	
	public Student(String name, int age, String schoolName) {
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
	}

	
	//method get/set
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	//method normal
	
}
