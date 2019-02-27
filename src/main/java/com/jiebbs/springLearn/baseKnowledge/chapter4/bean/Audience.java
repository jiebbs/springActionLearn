package com.jiebbs.springLearn.baseKnowledge.chapter4.bean;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 一个切面pojo
 * @author weijie
 * @version
 */
@Aspect //此注解标明这个是一个切面类
public class Audience {
	
	//此注解用于声明切点
	@Pointcut("execution(** com.jiebbs.springLearn.baseKnowledge.chapter4.bean.Performance.perform(..))")
	public void performance() {}
	
	//前置通知
	@Before("performance()")
	public void silenceCellPhones(){
		
		System.out.println("slience cell phone");
	}
	
	@Before("performance()")
	public void takeSeats() {
	
		System.out.println("Taking seat");
	}
	//后置通知（方法成功返回值后）
	@AfterReturning("performance()")
	public void applause() {
		
		System.out.println("clap!");
	}
	//后置通知（方法抛出异常后）
	@AfterThrowing("performance()")
	public void damandRefund() {
		System.out.println("Demanding a refund!");
	}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("slience cell phone");
			System.out.println("Taking seat");
			jp.proceed();
			System.out.println("clap!");
		}catch (Throwable e) {
			System.out.println("Demanding a refund!");
		}
	}
}
