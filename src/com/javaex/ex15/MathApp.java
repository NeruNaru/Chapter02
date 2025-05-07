package com.javaex.ex15;

public class MathApp {

	public static void main(String[] args) {
		
		
		//int var01= math.plus(5, 3);
		
		Math.plus(0, 0);
		
		//메소드 오버로딩
		System.out.println(Math.plus(5, 3));
		
		System.out.println(Math.plus(5, 3.3));
		
		System.out.println(Math.plus(5.5, 3));
		
		System.out.println(Math.plus(5.5, 3.3));
		
		System.out.println(Math.plus(5, 3.3));
		
		//
		Math math = new Math();

		System.out.println(math.circleArea(5));
	}

}
