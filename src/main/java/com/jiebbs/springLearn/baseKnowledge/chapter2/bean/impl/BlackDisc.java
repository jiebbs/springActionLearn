package com.jiebbs.springLearn.baseKnowledge.chapter2.bean.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.CompactDisc;

public class BlackDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;
	
	
	public BlackDisc() {}

	//@Value的作用与@Autowired 非常相识
	public BlackDisc(@Value("${disc.title}")String title,@Value("${disc.artist}")String artist) {
		this.title = title;
		this.artist = artist;
	}



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
	@Override
	public void playTrack(int trackNum) {
		System.out.println("Playing "+title+" by "+ artist +" playing track on "+tracks.get(trackNum-1));
	}
}
