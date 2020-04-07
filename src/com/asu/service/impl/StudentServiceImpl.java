/**
 * 
 */
package com.asu.service.impl;

import com.asu.dao.StudentDao;
import com.asu.service.StudentService;

/**
 * @author Shieh
 * @Date 2020-04-07 22:29:13
 * @Description
 *
 */
public class StudentServiceImpl implements StudentService {

//	private StudentDao stuDao = new StudentDaoImpl();// 之前的方式

// 业务层所需要的资源是自动注入的
// 说明dao接口的属性
private StudentDao stuDao;

	@Override
	public void show() {
		stuDao.show();
	}

	public void setStuDao(StudentDao stuDao) {
		this.stuDao = stuDao;
	}
}
