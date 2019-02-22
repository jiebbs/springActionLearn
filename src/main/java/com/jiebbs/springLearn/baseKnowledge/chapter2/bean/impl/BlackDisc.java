package com.jiebbs.springLearn.baseKnowledge.chapter2.bean.impl;

import java.util.List;

import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.CompactDisc;

public class BlackDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;
	
	
	public BlackDisc() {}


	public BlackDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public List<String> getTracks() {
		return tracks;
	}


	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}


	@Override
	public void play() {
		System.out.println("Playing "+title+" by "+ artist);
	}

}
