package com.javaex.ex17;

public class Point {
	
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
	
	//method get/set
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	//method normal
	
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]에 그림을 그렸습니다.");
	}
}
