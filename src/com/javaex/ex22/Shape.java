package com.javaex.ex22;

public class Shape {

	//field
	public String fillColor;
	public String lineColor;
	
	//editor
	
	public Shape() {
		System.out.println("Shape()");
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("shape(2)");
	}

	
	
	//method g/s
	
	public String getFillColor() {
		return fillColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public String getLineColor() {
		return lineColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	
	//method normal
	
	
	
}
