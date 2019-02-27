package com.jiebbs.springLearn.baseKnowledge.chapter4.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.CompactDisc;
import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.impl.BlackDisc;
import com.jiebbs.springLearn.baseKnowledge.chapter4.bean.TrackCounter;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

	@Bean
	public CompactDisc setSgtPeppers() {
		BlackDisc bd = new BlackDisc();
		bd.setTitle("1");
		bd.setArtist("2");
		List<String> trackList = new ArrayList<>();
		trackList.add("3");
		bd.setTracks(trackList);
		return bd;
	} 
	
	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}
}
