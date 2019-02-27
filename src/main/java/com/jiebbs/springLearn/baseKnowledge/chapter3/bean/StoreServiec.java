package com.jiebbs.springLearn.baseKnowledge.chapter3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//因为ShoppingCart作用域是Session,所以当类初始化spring进行注入时候，这个类是没有创建的
//此时spring注入的是一个与ShoppingCart有相同功能的代理类，通过懒解析最后委托到实现类上
@Component
public class StoreServiec {

	private ShoppingCart shoppingCart;
	
	@Autowired
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
}
