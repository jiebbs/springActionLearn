package com.jiebbs.springLearn.baseKnowledge.chapter4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.jiebbs.springLearn.baseKnowledge.chapter4.bean.Audience;

@Configuration
@EnableAspectJAutoProxy//这个注解启用AspectJ自动代理
@ComponentScan
public class ConcertConfig {
	
	@Bean
	public Audience audience() {
		return new Audience();
	}
}
