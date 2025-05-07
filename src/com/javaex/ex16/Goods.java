package com.javaex.ex16;

public class Goods {
	
	//field
	private String name;
	private int price;
	
	//editor
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	//method set/get
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}


	
	
	//method normal
	@Override
	public String toString() {
		return "Goods \n[name=" + name + ", price=" + price + "]";
	}
	
	public void showInfo() {
		System.out.println("==================");
		System.out.println("이름: " + name);
		System.out.println("가격: " + price);
	}
	
}
