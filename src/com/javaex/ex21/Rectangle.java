package com.javaex.ex21;

public class Rectangle {
		
		//field
		private String fillColor;
		private String lineColor;
		private int width;
		private int height;
		
		//editor
		
		public Rectangle() {
		}
		
		public Rectangle(String fillColor, String linecolor, int width, int height) {
			this.fillColor = fillColor;
			this.lineColor = linecolor;
			this.width = width;
			this.height = height;
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
		
		public int getWidth() {
			return width;
		}
		
		public void setWidth(int width) {
			this.width = width;
		}
		
		public int getHeight() {
			return height;
		}
		
		public void setHeight(int height) {
			this.height = height;
		}

		
		
		//method normal

		@Override
		public String toString() {
			return "Rectangle [fillColor=" + fillColor + ", linecolor=" + lineColor + ", width=" + width + ", height="
					+ height + "]";
		}
		
		public void draw() {
			System.out.println("===========사각형을 그렸습니다.===========");
			System.out.println("가로: " + width);
			System.out.println("세로: " + height);
			System.out.println("면색: " + fillColor);
			System.out.println("선색: " + lineColor);
			System.out.println("=====================================");
		}
}
