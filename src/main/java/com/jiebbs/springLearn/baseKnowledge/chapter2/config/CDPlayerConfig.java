package com.jiebbs.springLearn.baseKnowledge.chapter2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.CompactDisc;
import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.MediaPlayer;
import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.impl.CDPlayer;

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
@Configuration
@Import(com.jiebbs.springLearn.baseKnowledge.chapter2.config.CDConfig.class) //引入其他设置类
@ImportResource("classpath:chapter2.spring-context.xml") //引入xml设置文件
public class CDPlayerConfig {
	
	@Bean
	public MediaPlayer player(CompactDisc cd) {
		return new CDPlayer(cd);
	}
}
