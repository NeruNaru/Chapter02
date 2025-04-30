package com.javaex.ex08;

public class Goods {

	//필드
	private String name;
	private int price;
	//생성자
	//기본 생성자 만들기
	public Goods() {
		//기본생성자-자동으로 생성됨. 단, 따로 만들어진 생성자가 있다면 만들어지지 않는다.
		//메모리에 올리는 일을 대신 수행
		System.out.println("Goods()생성자 정상작동");
	}
	
	public Goods(String name, int price) {
		//메모리에 올리는 일을 수행
		System.out.println(name);
		System.out.println(price);
	}
	
	
	//메소드 gs
	
	//메소드 일반
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(price);
	}
}
