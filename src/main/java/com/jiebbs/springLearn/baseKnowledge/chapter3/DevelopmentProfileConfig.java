package com.jiebbs.springLearn.baseKnowledge.chapter3;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/*
	配置多个profile时，确保对应环境的profile处于激活状态.
	在Java配置中，可以使用@Profile注解指定某个bean属于哪一个profile
*/
@Configuration
@Profile("dev") 
public class DevelopmentProfileConfig {
	
	@Bean(destroyMethod="shutdown")
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.addScript("classpath:schema.sql")
				.addScript("classpath:test-data.sql")
				.build();
	}
	
	/*
	在spring3.2之后profile注解可以应用于方法之上,这样就可以在一个配置类中声明各个profile配置
	
	PS:
	尽管每个DataSource bean都被声明在一个profile中，并且只有当
	规定的profile激活时，相应的bean才会被创建，但是可能会有其他的bean并没有声明在一个
	给定的profile范围内。没有指定profile的bean始终都会被创建，与激活哪个profile没有关系。
	
	@Bean(destroyMethod="shutdown")
	@Profile("dev") 
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.addScript("classpath:schema.sql")
				.addScript("classpath:test-data.sql")
				.build();
	} 
	 
	*/
	
	
	
	
	
}
