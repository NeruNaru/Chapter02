package com.javaex.ex09;

public class Point {

	//필드
	private int x;
	private int y;
	//생성자
	//생성자 2개를 만들어보기
	public Point() {
		System.out.println("생성자 Point() 정상 작동");
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("좌표[x:" + x + " y:" + y + "]에 점을 그렸습니다.");
	}
	
	//메소드-gs
	//메소드-일반
	public void setX(int xx) {
		x = xx;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int yy) {
		y = yy;
	}
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("[" + x + ", " + y + "]");
	}

}
