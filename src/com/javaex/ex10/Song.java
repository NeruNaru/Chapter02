package com.javaex.ex10;

public class Song {
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	//기본생성자
	public Song() {
		System.out.println("기본생성자 Song() 정상 작동중");
	}
	//동시에 6개 다 받는 생성자
	public Song(String artist, String title, String album, int year, int track, String composer) {
		this(artist, title, album, year, composer);
		
		this.track = track;
		System.out.println("Song(6)");
	}
	/*
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	자바는 String,String 과 같이 변수의 형태로 다름을 구분하기 때문에 String, String으로 사용된
	생성자는 동일한 것으로 인식하여 함께 사용할 수 없다. 단, 자료형이 다르다면 인식한다.
	
	public Song(String title, String album) {
		this.title = title;
		this.album = album;
	}
	*/
	public Song(String title, int track) {
		this.title = title;
		this.track = track;
	}
	
	//생성자 5개
	public Song(String artist, String title, String album, int year, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.composer = composer;
		System.out.println("Song(5)");
	}
	
	//메소드-gs
	//메소드-일반
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getComposer() {
		return composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	public int getTrack() {
		return track;
	}
	
	public void showInfo() {
		System.out.println(artist + ", " + title + " (" + album + ", " + year + "년, " + track + "번 track, " + composer + " 작곡)");
	}
}
