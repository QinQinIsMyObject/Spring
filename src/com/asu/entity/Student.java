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

	/**
	 * 有参构造函数
	 */
	public Student(String sname) {
		super();
		this.sname = sname;
	}

	/**
	 * 无参构造函数
	 */
	public Student() {
		super();
	}

}
