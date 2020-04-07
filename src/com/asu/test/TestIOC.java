package com.asu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asu.entity.Student;
import com.asu.entity.User;

/**
 * @author Shieh
 * @Date 2020-04-07 18:44:18
 * @Description
 *
 */
public class TestIOC {

	public static void main(String[] args) {
		// 1、加载配置文件，构建spring容器；
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
		// 2、从容器中获得相应的对象；
//		Student student = (Student) ac.getBean("stu");
//		// 3、调用相应方法进行测试。
//		student.show();

		Student student1 = (Student) ac.getBean("stu1");
		student1.show();

		// p命令空间注入
		User user = (User) ac.getBean("u1");
		user.show();

		// c命令空间注入
		User user1 = (User) ac.getBean("u2");
		user1.show();
	}

}
