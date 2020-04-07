package com.asu.entity;

/**
 * @author Shieh
 * @Date 2020-04-07 21:25:10
 * @Description 实体类
 *
 */
public class User {

	private String name;
	private String sex;
	private Integer age;

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public User(String name, String sex, Integer age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public User() {
		super();
	}

	public void show() {
		System.out.println("\nname:" + name + "\nsex:" + sex + "\nage:" + age);
	}
}
