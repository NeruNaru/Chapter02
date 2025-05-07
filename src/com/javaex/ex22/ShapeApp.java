package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		
		Triangle t01 = new Triangle("파랑", "검정", 10, 5);
		System.out.println(t01.toString());
		t01.draw();
		
		
		Rectangle r01 = new Rectangle("빨강", "주황", 10, 5);
		System.out.println(r01.toString());
		r01.draw();
		
		Circle c01 = new Circle("초록", "빨강", 10);
		c01.draw();

		Shape[] sArray = new Shape[3];
		sArray[0] = t01;
		sArray[1] = r01;
		sArray[2] = c01;
		
		for(int i = 0 ; i<sArray.length ; i++) {
			System.out.println("면색: " + sArray[i].getFillColor());
			System.out.println("선색: " + sArray[i].getLineColor());
			System.out.println("================================");
		}
		
	}

}
