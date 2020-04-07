/**
 * 
 */
package com.asu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asu.service.StudentService;

/**
 * @author Shieh
 * @Date 2020-04-07 22:46:00
 * @Description
 *
 */
public class TestDIBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1、加载配置文件，构建spring容器；
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
		// 2、从容器中获得相应的对象；
		StudentService stusService = (StudentService) ac.getBean("stuService");
		// 3、调用相应方法进行测试。
		stusService.show();
	}

}
