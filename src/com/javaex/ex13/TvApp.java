package com.javaex.ex13;

public class TvApp {

	public static void main(String[] args) {
		Tv tv = new Tv();

		tv.status();
		
		tv.setPower(true);
		tv.setVolume(120); //100으로 유지
		tv.status();
		
		System.out.println("==============");
		
		tv.setVolume(false);
		tv.status();
		
		System.out.println("==============");
		
		tv.setChannel(0);
		tv.status();
		
		System.out.println("==============");
		
		tv.setChannel(true);
		tv.setChannel(true);
		tv.setChannel(true);
		tv.status();
		
		System.out.println("==============");
		
		tv.setPower(false);
		tv.status();
		
	}

}
