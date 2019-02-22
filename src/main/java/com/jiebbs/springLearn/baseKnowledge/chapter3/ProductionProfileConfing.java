package com.jiebbs.springLearn.baseKnowledge.chapter3;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
@Profile("prod")
public class ProductionProfileConfing {
	
	@Bean
	public DataSource dataSource() {
		JndiObjectFactoryBean jndiObjectFactoryBean =
				new JndiObjectFactoryBean();
		jndiObjectFactoryBean.setJndiName("");
		jndiObjectFactoryBean.setResourceRef(true);
		jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
		return (DataSource)jndiObjectFactoryBean.getObject();
	}
}
