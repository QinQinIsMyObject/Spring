package com.asu.entity;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Shieh
 * @Date 2020-04-07 18:46:04
 * @Description
 *
 */
public class Student {

	private String sname;// 姓名
	private Date dt;// 出生日期
	private String[] likes; // 爱好
	private List<String> friends; // 朋友
	private Set<String> games; // 游戏
	private Map<String, String> cards;// 会员卡
	private String work; // 工作
	private Properties baseinfo; // 基本信息

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public void setLikes(String[] likes) {
		this.likes = likes;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public void setGames(Set<String> games) {
		this.games = games;
	}

	public void setCards(Map<String, String> cards) {
		this.cards = cards;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public void setBaseinfo(Properties baseinfo) {
		this.baseinfo = baseinfo;
	}

	// 封装打印
	public void pt(Object obj) {
		System.out.println(obj);
	}

	/** 自我介绍 */
	public void show() {
		pt("我是：" + sname);
		pt("出生日期:" + new SimpleDateFormat("yyyy-MM-dd").format(dt));
		pt("爱好:" + Arrays.toString(likes));
		pt("我的朋友:" + friends);
		pt("游戏:" + games);
		pt("会员卡:" + cards);
		pt("工作:" + work);
		pt("基本信息:" + baseinfo);
	}

	/** 有参构造函数 */
	public Student(String sname) {
		super();
		this.sname = sname;
	}

	/** 无参构造函数 */
	public Student() {
		super();
	}

}
