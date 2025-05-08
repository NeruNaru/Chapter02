package com.javaex.ex23;

public class ShapeApp {

	public static void main(String[] args) {

		Shape[] sArray = new Shape[4];
		
		Shape t = new Triangle("발강", "빨강", 5, 3);
		Shape r = new Rectangle("노랑", "노랑", 10, 10);
		Shape c = new Circle("파랑", "파랑", 5);
		
		sArray[0] = t;
		sArray[1] = r;
		sArray[2] = c;
		
		
		Shape p = new Point(5, 5);
		sArray[3] = p;
		
		
		for(int i = 0 ; i<sArray.length ; i++) {
			sArray[i].draw();
		}
		
		for(int i = 0 ; i<sArray.length ; i++) {
			sArray[i].area();
		}
	}

}
