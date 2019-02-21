package com.jiebbs.springLearn.baseKnowledge.chapter2.config;

import org.springframework.context.annotation.Bean;

import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.CompactDisc;
import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.MediaPlayer;
import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.impl.CDPlayer;
import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.impl.SgtPeppers;

/**
 * spring配置类
 * Configuration 这个注解使标注的类变成配置类
 * ComponenetScan 这个注解开启自动扫描功能，扫描注解Componenet的bean
 * 		设定扫描的基础包的方式：1.使用basePackages属性，然后设置扫描的包名
 * 							2.使用basePackageClasses属性，设置基础包包含的类或接口，这样就会扫描包下注解的bean
 * 		
 * @author weijie
 * @version
 */

//@Configuration
//@ComponentScan(basePackageClasses= {CompactDisc.class})

public class CDPlayerConfig {
	
	//显式声明bean
	@Bean(value="lonelyHeardsClubBand")
	public CompactDisc cd() {
		return new SgtPeppers();
	}
	@Bean
	public MediaPlayer player(CompactDisc cd) {
		return new CDPlayer(cd);
	}
}
