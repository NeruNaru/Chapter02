package com.javaex.ex13;

public class Tv {

	//field
	private int channel;
	private int volume;
	private boolean power;
	
	//editor
	
	//original editor setting
	public Tv() {
		if(channel<=255 && channel>=1) {
			this.channel = channel;
		} else {
			channel = 7;
		}
		if(volume<=255 && volume>=0) {
			this.volume = volume;
		} else {
			volume = 20;
		}
		power = false;
	}
	
	//collect editor setting
	public Tv(int channel, int volume, boolean power) {
		this();
	}
	
	//method-gs//
	
	//int channel set/get
	public void setChannel(int channel) {
		if(channel>=1 && channel<=255) {
			this.channel = channel;
		}
	}
	public int channel() {
		return channel;
	}
	
	//int volume set/get
	public void setVolume(int volume) {
		if(volume>=0 && volume<=100) {
			this.volume = volume;
		}
	}
	public int volume() {
		return volume;
	}
	
	//boolean power set/get
	public void setPower(boolean power) {
		this.power = power;
	}
	public boolean getPower() {
		return power;
	}
	//boolean up(channel) set
	public void setChannel(boolean up) {
		if(up) {
			if(channel<255) {channel++;}
			else {
				if(channel>1) {channel--;}
			}
		}
	}
	
	//boolean up(volume) set
	public void setVolume(boolean up) {
		if(up) {
			if(volume<100) {volume++;}
			else {
				if(volume>0) {volume--;}
			}
		}
	}
	
	//method-nomal
	
	//status set
	public void status() {
		System.out.println("파워:" + power + " 채널:" + channel + " 볼륨:" + volume);
	}
}
