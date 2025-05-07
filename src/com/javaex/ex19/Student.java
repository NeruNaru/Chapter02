package com.javaex.ex19;

public class Student extends Person{

	//field
	private String schoolName;
	
	//editor
	public Student() {
		System.out.println("Studendt()");
		
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Studendt(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	//method get/set
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	//method normal
	
	public void showInfo() {
		System.out.println("======================");
		System.out.println("이름: " + name);
		System.out.println("나이: " + super.getAge());
		System.out.println("학교: " + this.schoolName);
		System.out.println("======================");
	}
}

/*
 * -생성자 순서
 * --> 자식의 생성자 시작(끝이 아님)
 * 		부모의 생성자 시작 -> 끝
 * 
 * -틀
 * 자식의 생성자가 부모 생성자를 고르는 방법
 * 
 * -자식의 부모의 필드에 접근하는 방법
 * (값을 넣는다, 읽는다)
 * 
 * private는 부모 자식 관계에도 안된다.
 * 캡슐화 유지
 * proteted(캡슐화 유지하면서 자식에게만 오픈)
 */
