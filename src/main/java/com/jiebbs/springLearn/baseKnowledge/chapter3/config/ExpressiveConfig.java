package com.jiebbs.springLearn.baseKnowledge.chapter3.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.impl.BlackDisc;

@Configuration
@PropertySource(value="classpath:/chapter3/expressiveConfigProperty.properties")
public class ExpressiveConfig {
	@Autowired
	Environment env;
	
	@Bean
	public BlackDisc disc() {
		return new BlackDisc(env.getProperty("disc.title"),env.getProperty("disc.artist"));
	}
}
