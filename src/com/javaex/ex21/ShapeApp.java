package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		
		Triangle t01 = new Triangle("주황", "검정", 10, 5);
		System.out.println(t01.toString());
			
		Rectangle r01 = new Rectangle("파랑", "남색", 20, 7);
		System.out.println(r01.toString());
		
		Circle c01 = new Circle("빨강", "주황", 10);
		System.out.println(c01.toString());


	}

}
