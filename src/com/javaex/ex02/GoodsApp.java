package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
//		camera.name = "nikkon";
//		camera.price = 400000;
//		
//		System.out.println(camera.name);
//		System.out.println(camera.price);
		
		camera.setName("nikkon");
		
		String name = camera.getName();
		System.out.println(name);

		camera.setPrice(400000);
		
		int price = camera.getPrice();
		System.out.println(price);
	}

}
