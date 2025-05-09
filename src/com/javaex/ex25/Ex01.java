package com.javaex.ex25;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//Point p01 = new Point();
		//p01.draw();
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		System.out.println("숫자 입력");
		System.out.print("숫자:");
		int num = sc.nextInt();		
		
		try {
			result = 100/num;
		} catch(ArithmeticException e) {
//			System.out.println(e.toString());
			System.out.println("0으로 나눌 수 없습니다");
		} finally {
			System.out.println("공통영역");
		}
		
		System.out.println(result);
		
		sc.close();
		
		
	}
}
