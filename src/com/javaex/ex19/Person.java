package com.javaex.ex19;

public class Person {
	
	//field
	
	protected String name;
	private int age;
	
	//editor
	public Person() {
		System.out.println("Person()");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
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
	
	//method normal
	
}
