package com.javaex.ex26;
//하드 디스크에 있는 피알을 읽어오는 클래스

import java.io.IOException;

public class MyFile {
	
	//field
	
	//editor
	
	//method g/s
	
	//method normal
	public String read(String path) {
		
		//파일이 없는 경우
		try {
			//path의 파일을 찾는다 C:\javastudy\java\주소록
			//파일의 내용을 읽는다
			//정상적이면 그대로 진행
			//========================
			//예외 발생(파일이 없는 경우)
			throw new IOException();
			
		} catch(Exception e) {
			System.out.println("파일이 없습니다");
		}
		
		return "";
	}
	
	
	public String read3(String path)throws IOException{
		
		throw new IOException();
		
	}
}
