package com.javaex.ex24;

public class Point extends Shape{
	
	//부모의 fillcolor, linecolor가 없어야함.
	
	//field
	private int x;
	private int y;
	
	//editor
	public Point() {
		
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	//method g/s
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	
	//method normal
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("=============점을 그렸습니다.============");
		System.out.println("x: " + this.x);
		System.out.println("y: " + this.y);
		System.out.println("=====================================");
	}
	
	public void area() {
		System.out.println("점은 넓이를 구할 수 없습니다");
	}
	
}
