package com.javaex.ex10;

public class SongApp {

	public static void main(String[] args) {
		Song song01 = new Song();
		song01.setTitle("좋은날");
		song01.setArtist("아이유");
		song01.setAlbum("Real");
		song01.setYear(2010);
		song01.setTrack(3);
		song01.setComposer("이민수");
		
		song01.showInfo();
		System.out.println("==================================");
		
		
		Song song02 = new Song("BIGBANG", "거짓말", "Always", 2007, 2, "G-DRAGON");
		
		song02.showInfo();
		
		System.out.println("==================================");
		
		Song song03 = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", 2012, "장범준");
		
		song03.setTrack(4);
		song03.showInfo();
		
		System.out.println("==================================");
		
	}

}
