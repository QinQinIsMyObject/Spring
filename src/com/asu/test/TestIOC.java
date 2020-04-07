package com.asu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asu.entity.Student;

/**
 * @author Shieh
 * @Date 2020-04-07 18:44:18
 * @Description
 *
 */
public class TestIOC {

	public static void main(String[] args) {
		// 1、加载配置文件，构建spring容器；
//		Resource resource = new ClassPathXmlApplicationContext().getResource("spring-config.xml");
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
		// 2、从容器中获得相应的对象；
		// Student student = new Student();//正常情况下
		// student.setSname("老谢");
		Student student = (Student) ac.getBean("stu");
		// 3、调用相应方法进行测试。
		student.show();
	}

}
