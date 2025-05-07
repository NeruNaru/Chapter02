package com.javaex.ex20;

public class ColorPoint extends Point{
	
	//field
	private String colorpoint;
	//editor
	public ColorPoint() {
		System.out.println("ColorPoint()");
	}
	
	public ColorPoint(String colorpoint) {
		this.colorpoint = colorpoint;
		System.out.println("ColorPoint(1)");
	}
	
	public ColorPoint(int x, int y, String colorpoint) {
		
		//초기화 방법 1
//		super(x, y);
//		this.colorpoint = colorpoint;
		
		//포기화 방법 2
		super.setX(x);
		super.setY(y);
		this.colorpoint=colorpoint;
		
		System.out.println("ColorPoint(3)");
	}
	
	//method get/set
	
	public String getColorpoint() {
		return colorpoint;
	}
	
	public void setColorpoint(String colorpoint) {
		this.colorpoint = colorpoint;
	}
	
	//method normal
	@Override
	public String toString() {
		return "Point [x=" + getX() + ", y=" + getY() + "]";
	}
	

	public void showInfo() {
		System.out.println("좌표 [x:" + getX() + ", y:" + getY() + "]에 입력했습니다.");
	}
}
