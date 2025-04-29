package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		Song list01 = new Song();
		list01.setTitle("좋은날");
		list01.setArtist("아이유");
		list01.setAlbum("Real");
		list01.setComposer("이민수 작곡");
		list01.setYear(2010);
		list01.setTrack(3);
		
		list01.showInfo();
		
		Song list02 = new Song();
		list02.setTitle("거짓말");
		list02.setArtist("BIGBANG");
		list02.setAlbum("Always");
		list02.setComposer("G-DRAGON 작곡");
		list02.setYear(2007);
		list02.setTrack(2);
		
		list02.showInfo();
		
		Song list03 = new Song();
		list03.setTitle("벚꽃엔딩");
		list03.setArtist("버스커버스커");
		list03.setAlbum("버스커버스커1집");
		list03.setComposer("장범준 작곡");
		list03.setYear(2012);
		list03.setTrack(4);
		
		list03.showInfo();

	}

}
