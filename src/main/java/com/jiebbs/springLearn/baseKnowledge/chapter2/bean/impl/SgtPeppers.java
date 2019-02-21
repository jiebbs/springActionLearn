package com.jiebbs.springLearn.baseKnowledge.chapter2.bean.impl;

import org.springframework.stereotype.Component;

import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.CompactDisc;

@Component(value="lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {
	
	private String title = "Sgt.Pepper's Lonely Hearts Club Band";
	private String artist ="The Beatles";
	
	@Override
	public void play() {
		System.out.println("playing "+title+" by "+artist);
	}

}
