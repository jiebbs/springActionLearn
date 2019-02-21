package com.jiebbs.springLearn.baseKnowledge.chapter2.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.CompactDisc;
import com.jiebbs.springLearn.baseKnowledge.chapter2.bean.MediaPlayer;

/**
 * 
 * @author weijie
 * @version
 */
@Component
public class CDPlayer implements MediaPlayer{

	//@Autowired 可以用于属性上
	private CompactDisc cd;
	
	/*
	属性require,默认设置为true的时候表明一定会进行自动装配，
	如果设置为false, 表明如果找到相应的bean 就自动装配，如果找不到就不进行自动装配
	*/
	@Autowired(required=false) //可以用于构造器上,
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	public CompactDisc getCd() {
		return cd;
	}
	
	//@Autowired 可以用于setter 方法上
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}
	
	/*
	 *@Autowired 可以置于任何方法上不仅仅是setter方法上
	 
	@Autowired
	public void insertCD(CompactDisc cd)  {
		this.cd = cd;
	}
	 
	*/

	@Override
	public void play() {
		cd.play();
	}
	
}
