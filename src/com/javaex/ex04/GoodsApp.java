package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		
		//메모리에 올리고
		Goods camera = new Goods();
		Goods mug_cup = new Goods();
		Goods LG_gram = new Goods();
		
		//니콘세팅
		camera.setName("nikkon");
		camera.setPrice(400000);
		
		//머그컵세팅
		mug_cup.setName("머그컵");
		mug_cup.setPrice(2000);
		
		//LG그램 세팅
		LG_gram.setName("LG 그램");
		LG_gram.setPrice(2000000);
		
		//니콘출력
		String name_c = camera.getName();
		int price_c = camera.getPrice();
		System.out.println(name_c);
		System.out.println(price_c);
		System.out.println("==============");
		//머그컵출력
		String name_m = mug_cup.getName();
		int price_m = mug_cup.getPrice();
		System.out.println(name_m);
		System.out.println(price_m);
		System.out.println("==============");
		//LG그램 출력
		String name_l = LG_gram.getName();
		int price_l = LG_gram.getPrice();
		System.out.println(name_l);
		System.out.println(price_l);
		System.out.println("==============");

	}

}
