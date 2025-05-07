package com.javaex.ex17;

public class PointApps {

	public static void main(String[] args) {
		Point[] pointArray = new Point[3];
		
		Point p01 = new Point(5, 5);
		Point p02 = new Point(10, 10);
		Point p03 = new Point();
		p03.setX(20);
		p03.setY(20);
		
		pointArray[0] = p01;
		pointArray[1] = p02;
		pointArray[2] = p03;
		
		for(int i = 0 ; i<pointArray.length ; i++) {
			System.out.println(pointArray[i].toString());
		
			pointArray[i].draw();
		}
	}

}
