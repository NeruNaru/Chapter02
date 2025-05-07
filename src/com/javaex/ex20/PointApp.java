package com.javaex.ex20;

public class PointApp {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(4);
		p.setY(4);
		
		System.out.println("===============");
		
		ColorPoint cp2 = new ColorPoint("red");
		
		System.out.println("===============");
		
		ColorPoint cp1 = new ColorPoint(10, 10, "blue");
		
		System.out.println("===============");
		
		cp2.showInfo();
		cp1.showInfo();
		
	}

}
