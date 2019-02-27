package com.jiebbs.springLearn.baseKonwledge.chapter4;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.CompactDisc;
import com.jiebbs.springLearn.baseKnowledge.chapter4.bean.TrackCounter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {com.jiebbs.springLearn.baseKnowledge.chapter4.config.TrackCounterConfig.class})
public class TrackCounterTest {

	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog(); 
	
	@Autowired
	private CompactDisc compactDisc;
	
	@Autowired
	private TrackCounter trackCounter;
	
	@Test
	public void test() {
		compactDisc.playTrack(1);
		
		assertEquals(new Integer(1),trackCounter.getPlayCount(1));
	
	}

}
