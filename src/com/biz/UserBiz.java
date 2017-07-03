package com.biz;

import com.bean.Users;
import com.dao.UserDao;

public class UserBiz {

	// 增加一个用户
	public boolean addUser(Users users){
		//调用dao曾保存对象
		UserDao userDao = new UserDao();
		return userDao.addUser(users);
	}
	 // 查询用户名
	public boolean findUser(Users users){
		//调用dao曾是佛存在
		UserDao userDao = new UserDao();
		return userDao.findUser(users);
	}
}
