package com.jiebbs.springLearn.baseKnowledge.chapter3.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //@Scope 作用声明bean的作用域
public class Notepad {

}
