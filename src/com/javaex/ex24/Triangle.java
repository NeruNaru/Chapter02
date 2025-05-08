package com.javaex.ex24;

public class Triangle extends Shape implements Drawable{

	//field
	private int width;
	private int height;
	
	//editor
	public Triangle() {
		System.out.println("Triangle()");
	}
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("Triangle(2)");
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("Triangle(4)");
	}

	
	//method g/s
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	
	//method normal
	
	
	
	public void draw() {
		System.out.println("===========삼각형을 그렸습니다.===========");
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println("=====================================");
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	
	public void area() {
		System.out.println("===========================");
		System.out.println(width*height/2);
	}
	
	
}
