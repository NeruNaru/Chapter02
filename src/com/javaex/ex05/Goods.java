package com.javaex.ex05;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() {
		//주의: 이 형태는 리턴이 없기 때문에 void나 다른 자료형을 넣어서는 안됨
		//메모리에 올린다
	}
	
	//메소드
	//name 등록
	public void setName(String n) {
		name = n;
	}
	
	//name 읽어오기
	public String getName() {
		return name;
	}
	
	//price 등록
	public void setPrice(int p) {
		price = p;
	}
	
	//price 읽어오기
	public int getPrice() {
		return price;
	}
	
	//info 등록
	public void showinfo() {
		System.out.println("=============");
		System.out.println("제품명: " + name);
		System.out.println("가격: " + price + "원");
		System.out.println("=============");
	}
	
}
