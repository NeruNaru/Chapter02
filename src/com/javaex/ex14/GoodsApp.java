package com.javaex.ex14;

public class GoodsApp {

	//static 조사 --> 스테틱 영역에 올려놓는다
	//스태틱 메모리에서 main()을 실행한다
	
	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("Nikkon");
		camera.setPric(400000);
		System.out.println(Goods.count);
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();

	}

}
