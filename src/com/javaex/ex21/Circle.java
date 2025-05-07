package com.javaex.ex21;

public class Circle {
	
	//field
	private String fillColor;
	private String lineColor;
	private int radius;
	
	//editor
	
	public Circle() {
	}
	
	public Circle(String fillColor, String linecolor, int radius) {
		this.fillColor = fillColor;
		this.lineColor = linecolor;
		this.radius = radius;
	}


	
	
	//method g/s
	
	public String getFillColor() {
		return fillColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public String getLinecolor() {
		return lineColor;
	}
	
	public void setLinecolor(String linecolor) {
		this.lineColor = linecolor;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
	//method normal

	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", linecolor=" + lineColor + ", radius=" + radius +  "]";
	}
	
	public void draw() {
		System.out.println("===========원을 그렸습니다.===========");
		System.out.println("지름: " + radius);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println("==================================");
	}
	
	

}

