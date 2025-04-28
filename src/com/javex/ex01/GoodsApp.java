package com.javex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "nikon";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		System.out.println("==============");
		
		Goods cup = new Goods();
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		System.out.println("==============");
		
		Goods computer = new Goods();
		
		computer.name = "LG_Gram";
		computer.price = 900000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
	}

}
