package com.asu.entity;

/**
 * @author Shieh
 * @Date 2020-04-07 18:46:04
 * @Description
 *
 */
public class Student {
	private String sname;

	public void setSname(String sname) {
		this.sname = sname;
	}

	/** 自我介绍 */
	public void show() {
		System.out.println("我是：" + sname);
	}
}
