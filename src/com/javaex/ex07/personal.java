package com.javaex.ex07;

import java.util.Scanner;

public class personal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String[] Song = new String[6];
		
		for(int i = 0 ; i<Song.length ; i++) {
			if(i == 0) {
				System.out.print("title:");
			}
			if(i == 1) {
				System.out.print("artist: ");
			}
			if(i == 2) {
				System.out.print("album: ");
			}
			if(i == 3) {
				System.out.print("composer: ");
			}
			if(i == 4) {
				System.out.print("year: ");
			}
			if(i == 5) {
				System.out.print("track: ");
			}
			Song[i] = sc.next();
			
		}
		
		for(int i = 0 ; i<Song.length ; i++) {
			System.out.println(Song[i]);
		}
		sc.close();
	}

}