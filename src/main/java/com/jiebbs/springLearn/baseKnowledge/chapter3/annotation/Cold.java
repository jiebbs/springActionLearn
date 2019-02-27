package com.jiebbs.springLearn.baseKnowledge.chapter3.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Target({ElementType.CONSTRUCTOR,ElementType.FIELD,
			ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier //当自定义注解中使用@Qualifier的时候，使用该自定义注解的类也会受到这个注解的影响
public @interface Cold {}
