package com.javaex.ex07;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//title aboard
	public void setTitle(String t) {
		title = t;
	}
	//title print
	public String getTitle() {
		return title;
	}
	//artist aboard
	public void setArtist(String a) {
		artist = a;
	}
	//artist print
	public String getArtist() {
		return artist;
	}
	//album aboard
	public void setAlbum(String a) {
		album = a;
	}
	//album print
	public String getAlbum() {
		return album;
	}
	//composer aboard
	public void setComposer(String c) {
		composer = c;
	}
	//composer print
	public String getComposer() {
		return composer;
	}
	//year aboard
	public void setYear(int y) {
		year = y;
	}
	//year print
	public int getYear() {
		return year;
	}
	//track aboard
	public void setTrack(int t) {
		track = t;
	}
	//track print
	public int getTrack() {
		return track;
	}
	
	//showInfo
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", " + track + "번 track, " + composer + " ) ");
	}
}