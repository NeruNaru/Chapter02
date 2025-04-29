package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		Point p01 = new Point();
		p01.setx(5);
		p01.sety(20);
		
		System.out.println(p01.getx());
		System.out.println(p01.gety());
		
		Point p02 = new Point();
		p02.setx(100);
		p02.sety(100);
		
		System.out.println(p02.getx());
		System.out.println(p02.gety());
		
		p01.draw();
		p02.draw();
	}

}
