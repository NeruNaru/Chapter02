package com.javaex.ex15;

public class Math {

	//field
//	private String name;
//	private int price;
	
	//editor
	/*
	public Math() {
		//메모리
	}
	*/
	
	
	//method set/get
	
	//method normal
	public static int plus(int a, int b) {
		return a+b;
	}
	public static double plus(int a, double b) {
		return a+b;
	}
	public static double plus(double a, int b) {
		return a+b;
	}
	public static double plus(double a, double b) {
		return a+b;
	}
	
	public double circleArea(int radius) {
		double result = 3.14*radius*radius;
		return result;
	}
	
}
