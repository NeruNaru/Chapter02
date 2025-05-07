package com.javaex.ex16;

public class GoodsApp {

	public static void main(String[] args) {
		
		//int[] intArr = new int[]
		
		//Goods를 관리할 배열3건을 메모리에 올린다.
		Goods[] goodsArr = new Goods[3];
		
		//상품을 메모리에 올린다
		Goods cup = new Goods("머그컵", 2000);
		Goods camera = new Goods("nikkon", 400000);
		Goods computer = new Goods("LG_gram", 1000000);
		
		goodsArr[0] = cup;
		goodsArr[1] = camera;
		goodsArr[2] = computer;
		
		cup.getName();
		
		//모든 상품의 이름 출력
		for(int i = 0 ; i<goodsArr.length ; i++) {
			System.out.println(goodsArr[i].getName());
		}
		
		//모든상품의 정보를 출려하세요
		for(int i = 0 ; i<goodsArr.length ; i++) {
			System.out.println(goodsArr[i].getName());
			System.out.println(goodsArr[i].getPrice());
		}
	}

}
