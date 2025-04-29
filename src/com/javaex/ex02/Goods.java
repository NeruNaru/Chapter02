package com.javaex.ex02;

public class Goods {
	
	//필드
		private String name;
		private int price;
		
		//생성자
		//메소드-gs, 일반
		
		//name 값 입력
		public void setName(String n) {
			//n이 "니콘"
			//위에 있는 name 입력
			name = n;
			//return이 필요 없는 경우
		}
		
		//name 값 읽어오기
		public String getName() {
			return name;
		}
		
		public void setPrice(int p) {
			price=p;
		}
		public int getPrice() {
			return price;
		}

}
