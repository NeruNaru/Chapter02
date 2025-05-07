package com.javaex.ex14;

public class Goods {
	
	//field
	private String name;
	private int price;
	public static int count;
	
	//editor
	public Goods() {
		count++;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		count++;
	}
	
	
	//method set/get
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setPric(int p) {
		price = p;
	}
	public int getPric() {
		return price;
	}
	
	//method normal
	public void showInfo() {
		System.out.println(name);
		System.out.println(price);
	}
	
}
