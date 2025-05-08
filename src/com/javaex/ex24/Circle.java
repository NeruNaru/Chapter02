package com.javaex.ex24;

public class Circle extends Shape{
	//field
	private int radius;
	
	//editor
	public Circle() {
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}
	
	//method g/s
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	//method normal
	public void draw() {
		System.out.println("===========삼각형을 그렸습니다.===========");
		System.out.println("지름: " + radius);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println("=====================================");
	}
	
	public void area() {
		System.out.println("==========원의 넓이===========");
		System.out.println(3.14*radius*radius);
	}
}
