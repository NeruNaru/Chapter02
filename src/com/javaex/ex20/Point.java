package com.javaex.ex20;

public class Point {
	//field
	private int x;
	private int y;
	
	//editor
	
	public Point() {
		System.out.println("Point()");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(2)");
	}

	//method set/get
	
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
	
	
	
}
