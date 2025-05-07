package com.javaex.ex19;

public class PersonApp {

	public static void main(String[] args) {
		Student s01 = new Student();
		s01.setSchoolName("제주고등학교");
		
		System.out.println("--------------------------");
		
		Student s02 = new Student();
		s02.setSchoolName("서울고등학교");
		s02.setName("정우성");
		s02.setAge(22);
		
		System.out.println("--------------------------");
		
		Student s03 = new Student("이효리", 22, "제주고등학교");
		
		System.out.println(s03.getSchoolName());
		System.out.println(s03.getName());
		
		s01.showInfo();
		s02.showInfo();
		s03.showInfo();
	}

}
