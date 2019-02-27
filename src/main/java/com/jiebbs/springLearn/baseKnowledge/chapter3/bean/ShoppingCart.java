package com.jiebbs.springLearn.baseKnowledge.chapter3.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

//将bean声明为 session作用域,同时设置基于接口的代理，而这个代理必须实现ShoppingCart这个接口
@Component
@Scope(value=WebApplicationContext.SCOPE_SESSION,
		proxyMode=ScopedProxyMode.INTERFACES) 
public interface ShoppingCart {

}
