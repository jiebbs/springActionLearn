package com.jiebbs.springLearn.baseKnowledge.chapter2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.CompactDisc;
import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.impl.SgtPeppers;

@Configuration
public class CDConfig {

	//显式声明bean
		@Bean(value="lonelyHeardsClubBand")
		public CompactDisc cd() {
			return new SgtPeppers();
		}
}
