package com.javaex.ex06;

public class Point {

	//필드
	private int x;
	private int y;
	
	//메소드
	
	//name
	public void setx(int x) {
		this.x = x;
	}
	
	public int getx() {
		return x;
	}
	
	public void sety(int y) {
		this.y = y;
	}
	
	public int gety() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
}
